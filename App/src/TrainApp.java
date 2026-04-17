import java.util.Scanner;

public class TrainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input bogie IDs
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieIDs = new String[n];
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIDs[i] = sc.nextLine();
        }

        // Step 2: Input search key
        System.out.print("Enter bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3: Perform Linear Search
        boolean found = linearSearch(bogieIDs, searchKey);

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found in the consist.");
        }
    }

    // Linear Search implementation
    public static boolean linearSearch(String[] arr, String key) {
        for (String bogie : arr) {
            if (bogie.equals(key)) {
                return true; // Early termination when match found
            }
        }
        return false; // Not found after full traversal
    }
}
