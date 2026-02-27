import java.util.Scanner;

class ArrayExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 4; // Array size is 4
        int[] arr = new int[size];

        try {
            System.out.println("Enter the numbers:");

            // Trying to insert 5 elements into array of size 4
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();   // Exception occurs when i = 4
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }

        sc.close();
    }
}