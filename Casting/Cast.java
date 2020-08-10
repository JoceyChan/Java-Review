public class Cast {
    public static void main(String[] args){
        //implicit casting, automatic casting or automatic conversion
        // byte > short > int > long > float > double
        // When casting there is no data loss when casting 
        short x = 1; // short has two bytes 
        int y = x + 2; //int has 4 bytes
        System.out.println(y);

        double a = 1.1;
        double b = a + 2;
        System.out.println(a);
    }
    
}