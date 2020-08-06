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

         Point point1 = new Point(1, 1); //Point point1 = new Point(x, y);
         Point point2 =  point1;
         point1.x = 2;
         System.out.println(point2);

         //String types
         String message = "Hello World" + "!!"; //initialized short hand
         System.out.println(message.endsWith("!!"));
         System.out.println(message.startsWith("!!"));
         System.out.println(message.length());
         System.out.println(message.indexOf("e"));
         System.out.println(message.replace( "!", "*")); // System.out.println(message.replace( target, replacement)); 

    }
}