import java.util.Scanner;
public class MortgagaCalc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Principle: ");
        double p = scan.nextInt();
        System.out.print("Annual Interest Rate: ");
        double r = scan.nextInt();
        System.out.print("Number of payments: ");
        double n = scan.nextInt();

        double a = 1 + r;
        double top = r * Math.pow(a, n);
        System.out.println(a);
        System.out.println(top);

        double bottom = Math.pow(a, n) - 1;
        System.out.println(bottom);

        double together = p * (top/bottom);
        System.out.println("Mortgage Payment: " + together);
    }
}