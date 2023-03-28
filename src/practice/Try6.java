package practice;

public class Try6 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
