import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Passenger bogies added: " + passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Check existence of Sleeper
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper bogie exist? " + exists);

        // Final list state
        System.out.println("Final passenger bogies: " + passengerBogies);

        // Program continues...
        System.out.println("System ready for further operations...");
    }
}