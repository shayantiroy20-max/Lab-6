import java.util.Scanner;

// User-defined Exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
class ProcessInputDemo {

    // Method to process input
    public void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (number * 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessInputDemo obj = new ProcessInputDemo();

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        try {
            obj.ProcessInput(num);
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}
