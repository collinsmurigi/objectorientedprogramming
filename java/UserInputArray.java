import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[15];

        // Taking 15 integer values as input from the user
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            values[i] = scanner.nextInt();
        }

        // Printing the values stored in the array
        System.out.println("Values stored in the array:");
        System.out.println(Arrays.toString(values));

        // Asking user to enter a number and checking its presence in the array
        System.out.println("Enter a number to check its presence in the array:");
        int num = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < 15; i++) {
            if (values[i] == num) {
                found = true;
                System.out.println("The number found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // Creating a new array with elements in reverse order and printing its elements
        int[] reverseArray = new int[15];
        for (int i = 0; i < 15; i++) {
            reverseArray[i] = values[14 - i];
        }
        System.out.println("Elements of the new array in reverse order:");
        System.out.println(Arrays.toString(reverseArray));

        // Calculating the sum and product of elements in the array
        int sum = 0, product = 1;
        for (int value : values) {
            sum += value;
            product *= value;
        }
        System.out.println("Sum of elements in the array: " + sum);
        System.out.println("Product of elements in the array: " + product);
    }
}
