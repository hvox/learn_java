import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    private final int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    public MyArray(Scanner sc) {
        int n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
    }

    int product() {
        int result = 1;
        for (int x : array) {
            result *= x;
        }
        return result;
    }

    int[] reversed() {
        int n = array.length;
        int[] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < n / 2; i++) {
            int temp = result[i];
            result[i] = result[n - i - 1];
            result[n - i - 1] = temp;
        }
        return result;
    }

    boolean isPalindrome() {
        return Arrays.equals(array, this.reversed());
    }

    int[] removePrefix(int[] prefix) {
        int mismatch = Arrays.mismatch(array, prefix);
        if (mismatch != -1 && mismatch != prefix.length) {
            return array;
        }
        return Arrays.copyOfRange(array, prefix.length, array.length);
    }
}
