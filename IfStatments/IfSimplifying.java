public class IfSimplifying {
    public static void main(String[] args){
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000); //in order to not use if else statment we just initialize where we declared

        String className = income > 100_000 ? "First" : "Economy"; // use ternary operator which is the "?" and the ":"
            }
}