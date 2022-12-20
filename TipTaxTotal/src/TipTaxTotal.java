import java.text.DecimalFormat;
import java.util.Scanner;
public class TipTaxTotal {
    static Scanner inputDevice;
    static DecimalFormat dollarAmt;
    static double iCharge, cTip, cTax, cTotal;
    static String iDate, oTotal, oTax, oTip, oCharge;

    public static void main(String[] args) {
        init();
        input();
        calcs();
        output();

    }


    public static void init() {
        inputDevice = new Scanner(System.in);  //instantiates Scanner
        inputDevice.useDelimiter("\r\n");

        dollarAmt = new DecimalFormat ("$#,###.00");

    }

    public static void input() {
        System.out.println("Enter the food cost: ");
        iDate = inputDevice.nextLine();
        iCharge = Double.parseDouble(iDate);
    }

    public static void calcs() {
        cTip = .15 * iCharge;
        cTax = iCharge * .07;
        cTotal = iCharge + cTip + cTax;

    }

    public static void output() {
        System.out.println(Motto.getMotto());
        oCharge = dollarAmt.format(iCharge);
        oTip = dollarAmt.format(cTip);
        oTax = dollarAmt.format(cTax);
        oTotal = dollarAmt.format(cTotal);

        System.out.println("Food Charge: " + oCharge);
        System.out.println("Tip charge: " + oTip);
        System.out.println("Tax Charge: " + oTax);
        System.out.println("Total: " + oTotal);
    }
}