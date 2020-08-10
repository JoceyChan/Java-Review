public class Main {
    public static void main(String[] args){
        int result = 10/3; 
        System.out.println(result);

        double result2 = (double)10 / (double)3;
        System.out.println(result2);

        int x = 1;
        int y = ++x; //x++ is one and ++x is 2
        System.out.println(x);
        System.out.println(y);

        int a = 1;
        a = a + 2;
        a += 2;
        System.out.println(a);

        int b = 1;
        b /= 2; // Augmented or Compound operators
        System.out.println(b);

        int c = (10*3) + 4;
        System.out.println(c);

    }
    
}