import java.util.Date;
import java.awt.*;

public class Types {
    public static void main(String[] args){
        // Refrence type
        byte age = 30; 
        Date now = new Date(); // variable is an instance of the class Date
       // now.getTime(); //dot gives you members in refrence type
        System.out.println(now); //type sout tab,  gives us System.out.println

         //Primitative types
         Byte a = 1; 
         Byte b = a;
         a = 2;
         System.out.println(b);

         Point point1 = new Point( x:1, y:1);
         Point point2 =  point1;
    }
}