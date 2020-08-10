import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        int i = 0;
        while (i > 0){ //use when we do not know how many times we want to print
           System.out.println("Hello World" + i);
           i--; 
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
            while (!input.equals("quit")){
                System.out.println("Input: ");
                input = scanner.next().toLowerCase();
                if(input.equals("pass"))
                if(!input.equals("quit"))
                    System.out.println(input);
            }

            // while (true){
            //     System.out.println("Input: ");
            //     input = scanner.next().toLowerCase();
            //     if(input.equals("pass"))
            //         continue; //moves control to the beginning of the loop
            //     if(!input.equals("quit"))
            //         break;//break statment terminates a loop
            //     System.out.println(input);
            // }
    }
}