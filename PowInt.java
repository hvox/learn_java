import java.util.Scanner;

public class PowInt {
    // поля
    private final double x;
    private final int n;
    // конструкторы
    public PowInt(double x, int n) {
        this.x = x;
        this.n = n;
    }
    public PowInt(String[] val) {
        this(Double.parseDouble(val[0]), Integer.parseInt(val[1]));
        //x = Double.parseDouble(val[0]);
        //n = Integer.parseInt(val[1]);
    }
    public PowInt(Scanner sc) {
        //this(sc.nextDouble(), sc.nextInt()); // !!!
        x = sc.nextDouble();
        n = sc.nextInt();
    }
    // методы
    public double powInt() {
        double xPowN = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            xPowN *= x;
        }
        if (n < 0) {
            xPowN = 1.0 / xPowN;
        }
        return xPowN;
    }
    public void println() {
        System.out.println(x + " в степени " + n + " равно " + powInt());
    }
    public void printf() {
        System.out.printf("%.3f в степени %d равно %.3f\n", x, n, powInt());
    }
}
