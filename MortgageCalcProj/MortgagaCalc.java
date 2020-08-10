import java.util.Scanner;
public class MortgagaCalc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Principle: ");
        double p = scan.nextInt();
        System.out.print("Monthly interest rate: ");
        double r = scan.nextInt();
        System.out.print("Number of payments: ");
        double n = scan.nextInt();

        double a = 1 + r;
        double top = r * Math.pow(a, n);
        System.out.println(a);
        System.out.println(top);

        double bottom = Math.pow(a, n) - 1;
        System.out.println(bottom);

    }
}