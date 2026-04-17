import java.util.Arrays;
import java.util.Scanner;

public class TrainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input bogie IDs
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieIDs = new String[n];
        System.out.println("Enter bogie IDs (unsorted):");
        for (int i = 0; i < n; i++) {
            bogieIDs[i] = sc.nextLine();
        }

        // Step 2: Sort bogie IDs (Binary Search requires sorted data)
        Arrays.sort(bogieIDs);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIDs));

        // Step 3: Input search key
        System.out.print("Enter bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 4: Perform Binary Search
        boolean found = binarySearch(bogieIDs, searchKey);

        // Step 5: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found in the consist.");
        }
    }

    // Binary Search implementation
    public static boolean binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                return true; // Match found
            } else if (comparison < 0) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }
        return false; // Not found
    }
}
