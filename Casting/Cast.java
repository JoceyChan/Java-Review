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
    }
    
}