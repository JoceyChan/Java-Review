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
        int principle = scan.nextInt();

        System.out.print("Annual Interest Rate: ");
        float rate = scan.nextFloat();
        float monthlyInterest = rate / percent / months_in_year;

        System.out.print("Period (Years): ");
        byte years = scan.nextByte(); //use byte because the max we want to support is the number 30 
        int numberOfPayments = years * months_in_year;

        double addingRate = 1 + monthlyInterest;
        double top = monthlyInterest * Math.pow(addingRate, numberOfPayments);
        double bottom = Math.pow(addingRate, numberOfPayments) - 1;
        double together = principle * (top/bottom);

        String togetherFormated = NumberFormat.getCurrencyInstance().format(together);
        System.out.println("Mortgage Payment: " + togetherFormated);
    }
}