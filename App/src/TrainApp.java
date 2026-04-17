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
        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIDs[i] = sc.nextLine();
            }
        }

        // Step 2: Input search key
        System.out.print("Enter bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3: Defensive check before searching
        try {
            boolean found = binarySearchWithValidation(bogieIDs, searchKey);
            if (found) {
                System.out.println("Bogie ID " + searchKey + " found in the consist.");
            } else {
                System.out.println("Bogie ID " + searchKey + " not found in the consist.");
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Binary Search with defensive validation
    public static boolean binarySearchWithValidation(String[] arr, String key) {
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        Arrays.sort(arr); // Ensure sorted before searching
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
