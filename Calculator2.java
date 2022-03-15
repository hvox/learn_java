public class Calculator2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("ERROR! WRONG FORMAT OF ARGUMENTS!");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        int result;
        switch (args[1]) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            case "%":
                result = x % y;
                break;
            default:
                System.err.println("ERROR! Second argument should be operator.");
                return;
        }
        System.out.printf("%d %s %d = %d\n", x, args[1], y, result);
    }
}
