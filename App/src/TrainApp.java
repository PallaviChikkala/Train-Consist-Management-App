import java.util.Arrays;
import java.util.Scanner;

public class TrainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input bogie type names
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieNames = new String[n];
        System.out.println("Enter bogie type names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = sc.nextLine();
        }

        // Step 2: Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Step 3: Display sorted bogie names
        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));
    }
}
