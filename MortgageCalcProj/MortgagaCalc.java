import java.text.NumberFormat;
import java.time.YearMonth;
import java.util.Scanner;
public class MortgagaCalc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //set these to not have magic numbers
        final byte months_in_year = 12;
        final byte percent = 100; 

        System.out.print("Principle: ");
        int p = scan.nextInt();

        System.out.print("Annual Interest Rate: ");
        float r = scan.nextFloat();
        float monthlyInterest = r / percent / months_in_year;

        System.out.print("Period (Years): ");
        byte years = scan.nextByte();
        int n = years * months_in_year;

        double a = 1 + monthlyInterest;
        double period = n;
        double top = monthlyInterest * Math.pow(a, period);
        double bottom = Math.pow(a, period) - 1;
        double together = p * (top/bottom);

        String togetherFormated = NumberFormat.getCurrencyInstance().format(together);
        System.out.println("Mortgage Payment: " + togetherFormated);
    }
}