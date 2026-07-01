import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Maximum Value: " + maxValue);
        System.out.println("Index of Maximum Value: " + maxIndex);

        scanner.close();
    }
}
