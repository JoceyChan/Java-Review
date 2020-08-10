import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
    //divisible by 3 pribt buzz
    // if divisible by both 5 and 3 print fizz buzz
    // if not divisble the print number
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Number: ");

    int n = scan.nextInt();
    if (n % 5 == 0){ // does not look good to have repeated conditions
        if (n % 3 == 0)
            System.out.println("Fizz Buzz");
        else
            System.out.println(n);

    }
    else if (n % 3 == 0) // "%" divisible operator
    System.out.println("Buzz");
     
    // if ((n % 5 == 0) && (n % 3 == 0)) // make sure to put the specifics first
    //     System.out.println("Fizz Buzz");
    // else if (n % 5 == 0)
    // System.out.println("Fizz"); 
    // else if (n % 3 == 0) // "%" divisible operator
    // System.out.println("Buzz");
    // else
    //     System.out.println(n);
        
    }
}