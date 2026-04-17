import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input passenger bogie capacities
        System.out.print("Enter number of passenger bogies: ");
        int n = sc.nextInt();
        int[] capacities = new int[n];

        System.out.println("Enter capacities of passenger bogies:");
        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        // Step 2: Apply Bubble Sort
        bubbleSort(capacities);

        // Step 3: Display sorted capacities
        System.out.println("Sorted Passenger Bogie Capacities:");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
    }

    // Bubble Sort implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if no swaps occurred
            if (!swapped) break;
        }
    }
}
