public class Cast {
    public static void main(String[] args){
        //implicit casting, automatic casting or automatic conversion
        // byte > short > int > long > float > double
        // When casting there is no data loss when casting 
        short x = 1; // short has two bytes 
        int y = x + 2; //int has 4 bytes
        System.out.println(y);

        double a = 1.1;
        int b = (int) a + 2; //explicit casting when the type is compatable 
        System.out.println(a);

        String c = "1"; // not compatable so can't have a string and an int 
        //Integer.parseInt(); // int
        //int d = (int) c + 2;
        int d = Integer.parseInt(c) + 2;
        System.out.println(d);  

        String i = "1.1";
        double j = Double.parseDouble(i) + 2;
        System.out.println(j);

        int result = Math.round(1.1F); // gets a double or float and rounds 
        System.out.println(result);

        int result2 = Math.max(1, 2); // gets the greates num from the given 
        int mins = Math.min(6, 8); // gets the minimum from the given 
        double rand = Math.random() * 100; //gives you a random decimal
        //if we do in int then it would go as this:
        // int rand = (int) Math.round(Math.random() * 100); //casting
        // if we don['t want the rounding but want an int then we do this:
        // int rand = (int)(Math.random() * 100);
        System.out.println(result2);
        System.out.println(mins);
        System.out.println(Math.round(rand));
    }
    
}