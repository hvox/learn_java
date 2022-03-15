import java.util.Arrays;

public class ArrayTools {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Product: " + product(array));
    }


    static int product(int[] array) {
        int result = 1;
        for (int x : array)
            result *= x;
        return result;
    }
}
