import java.util.Date;

public class Types {
    public static void main(String[] args){
        // Refrence type
        byte age = 30; 
        Date now = new Date(); // variable is an instance of the class Date
       // now.getTime(); //dot gives you members in refrence type
        System.out.println(now); //type sout tab,  gives us System.out.println

         //Primitative types
         Byte x = 1; 
         Byte y = x;
         x = 2;
         System.out.println(y);
    }
}