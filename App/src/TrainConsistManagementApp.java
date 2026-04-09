import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // duplicate ignored

        // Display final formation order
        System.out.println("Train formation (in insertion order, no duplicates): " + trainFormation);

        // Program continues...
        System.out.println("System ready for further operations...");
    }
}