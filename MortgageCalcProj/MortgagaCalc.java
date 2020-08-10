import java.time.YearMonth;
import java.util.Scanner;
public class MortgagaCalc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Principle: ");
        int p = scan.nextInt();

        System.out.print("Annual Interest Rate: ");
        float r = scan.nextFloat();

        System.out.print("Period (Years): ");
        double n = scan.nextDouble();

        double year = (r/12) / 4;
        double a = 1 + year;
        double period = n * 12;
        double top = year * Math.pow(a, period);
        double bottom = Math.pow(a, period) - 1;
        double together = p * (top/bottom);
        System.out.println("Mortgage Payment: " + Math.round(together));
    }
}