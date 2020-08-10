public class ForEachLoop {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]); //returns the item at the given index
        }
        for(String fruit : fruits){ // we do not have acces to the index
            System.out.println(fruit); 
        }
    }
}