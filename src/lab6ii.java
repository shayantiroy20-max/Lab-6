class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;   // Dividing by zero will cause ArithmeticException

        try {
            int result = a / b;   // Exception occurs here
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}