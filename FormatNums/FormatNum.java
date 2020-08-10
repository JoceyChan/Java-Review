import java.text.NumberFormat;

public class FormatNum {
    public static void main(String[] args){
        // if you want to display this to the user add a "$" and every three digits add a commas as the following:
        // $1,234,567 
       // NumberFormat currency = new NumberFormat(); // we can not create and instance of a class as it is an abstract
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percentage = NumberFormat.getPercentInstance(); //Shift + F6 = changes the subject and the refrence at the same time
        String result2 = percentage.format(1234567.891);
        System.out.println(result2);

        String results = NumberFormat.getPercentInstance().format(0.1); //Same thing as the top but using .format instead and not using a variable 
        System.out.println(results);
    }
    
}