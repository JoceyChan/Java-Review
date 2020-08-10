import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        //number if number is divisbale by 5 print fizz
        // if 10 print fizz 
    //divisible by 3 pribt buzz
    // if divisible by both 5 and 3 print fizz buzz
    // if not divisble the print number
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Number: ");

    int n = scan.nextInt();

    if (n % 5 == 0){
        System.out.println("Fizz");
    }
        
    }
}