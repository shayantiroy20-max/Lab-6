// User-defined Exception
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

class CheckArgumentDemo {

    public static void main(String[] args) {

        try {
            // Check if arguments are less than 4
            if (args.length < 4) {
                throw new CheckArgument("CheckArgument");
            }

            int sum = 0;

            // Calculate sum of squares of first four arguments
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num * num;
            }

            System.out.println(sum);
        }
        catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter valid integer arguments.");
        }
    }
}