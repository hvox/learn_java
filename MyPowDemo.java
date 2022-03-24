import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MyPowDemo {
    public static void main(String[] args) {

        // явная инициализация
        PowInt b = new PowInt(3, 2);
        b.println();
        b.printf();

        // аргументы командной строки
        PowInt b1 = new PowInt(args);
        b1.println();
        b1.printf();

        // консольный ввод
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите основание степени и степень: ");
        b = new PowInt(sc);
        b.println();
        b.printf();

        // ввод из текстового файла
        try {
            sc = new Scanner(new FileReader("data/input.txt"));
            b = new PowInt(sc);
        }
        catch (FileNotFoundException ex) {
            System.err.println("ERROR: Текстовый файл не найден!");
        }
        b.println();
        b.printf();

        // ввод из файла csv
        try {
            sc = new Scanner(new FileReader("data/input.csv"));
            b = new PowInt(sc.nextLine().split(";"));
        }
        catch (FileNotFoundException ex) {
            System.err.println("ERROR: CSV файл не найден!");
        }
        b.println();
        b.printf();

        // альтернативный ввод из файла csv
        try {
            sc = new Scanner(new FileReader("data/input.csv"));
            sc.useDelimiter(";"); // <-- очень классный метод, мне нравится!
            b = new PowInt(sc);
        }
        catch (FileNotFoundException ex) {
            System.err.println("ERROR: CSV файл не найден!");
        }
        b.println();
        b.printf();
    }
}
