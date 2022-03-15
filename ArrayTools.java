import java.util.Arrays;

public class ArrayTools {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Product: " + product(array));
        reverse(array);
        System.out.println("Reversed: " + Arrays.toString(array));
        System.out.println(Arrays.toString(array) + " is palindrome: " + isPalindrome(array));
    }


    static int product(int[] array) {
        int result = 1;
        for (int x : array)
            result *= x;
        return result;
    }


    static void reverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }


    static boolean isPalindrome(int[] array) {
        int[] reversed = Arrays.copyOf(array, array.length);
        ArrayTools.reverse(reversed);
        return Arrays.equals(array, reversed);
    }
}
