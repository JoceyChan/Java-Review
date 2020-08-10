public class Main {
    public static void main(String[] args){
        int temp = 32;
        if (temp > 30) { //if this condition is true it will print the print statement
            System.out.println("It is a hot day");
            System.out.println("Drink water");
        } 
        else if (temp > 20) //does not need a "{}" because it is only one statement
            System.out.println("Beautiful day");
        else 
        System.out.println("Cold day");
    }

}
