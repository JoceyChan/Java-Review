import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        String input = "";

        do { 
            System.out.println("Input: ");
            input = scan.next().toLowerCase();
            System.out.println(input);
     } 
      while(!input.equals("quit"));  
    }
}