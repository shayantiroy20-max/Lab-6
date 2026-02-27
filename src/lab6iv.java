import java.util.Scanner;

// User-defined Exceptions
class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

// Time class
class Time {
    int hours, minutes, seconds;

    public void getTime() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hours = sc.nextInt();

        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();

        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();

        if (hours < 0 || hours > 24) {
            throw new HrsException("hour is not greater than 24");
        }

        if (minutes < 0 || minutes > 60) {
            throw new MinException("hour is not greater than 60");
        }

        if (seconds < 0 || seconds > 60) {
            throw new SecException("hour is not greater than 60");
        }

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}
// Main class
class TimeExceptionDemo {
    public static void main(String[] args) {
        Time t = new Time();

        try {
            t.getTime();
        }
        catch (HrsException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidHourException:" + e.getMessage());
        }
        catch (MinException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidMinuteException:" + e.getMessage());
        }
        catch (SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidSecondException:" + e.getMessage());
        }
    }
}