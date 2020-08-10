import java.util.Arrays;

public class MultiDim {

    public static void main(String[] args) {
        int[][] numbers = new int[2][3]; //2D, to make 3D use [][][]
        numbers [0][0] = 1;
        // Arrays.toString(numbers); //string representation of the array
        System.out.println(Arrays.deepToString(numbers));
    }
}