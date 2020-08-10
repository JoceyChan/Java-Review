public class Main {
    public static void main(String[] args){
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;  // boolean is true or false, "&&"" is "and" 
        System.out.println(isWarm);
        // if one of the conditions is false then the result would be false as both conditions are not true
    }
}