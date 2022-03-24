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

    public static void main(String[] args) {
        MyArray array;
        try {
            String inputPath = "data/input.txt";
            if (args.length == 1) {
                inputPath = args[0];
            }
            array = new MyArray(new Scanner(new FileReader(inputPath)));
        }
        catch (FileNotFoundException ex) {
            System.err.println("ERROR! Файл не найден!");
            return;
        }
        System.out.println("Array: " + array);
        System.out.println("Product: " + array.product());
        System.out.println("Reversed: " + Arrays.toString(array.reversed()));
        System.out.println("" + array + " is palindrome: " + array.isPalindrome());
        int[] prefix = {1, 2};
        int[] difference = array.removePrefix(prefix);
        System.out.print("" + array + " - " + Arrays.toString(prefix));
        System.out.println(" = " + Arrays.toString(difference));
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

    public String toString() {
        return Arrays.toString(array);
    }
}
