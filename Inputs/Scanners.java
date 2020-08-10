import java.util.Scanner;
public class Scanners {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner. nextByte();
        System.out.println("You are " + age );

        System.out.print("Name: ");
        String name = scanner.nextLine(); //for string you don't need .nextString(); it is just .next();
        System.out.println("You are " + name); //Only prints out the first name and not the last name, when inputed both names
        // the printed words are called tokens so in order to print out both tokens we need to call the next method twice NOT IDEAL 
        // therefore use .nectLine()
    }
}