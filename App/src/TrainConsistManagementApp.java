import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogies with their capacities
        bogieCapacityMap.put("Sleeper", 72);       // 72 seats
        bogieCapacityMap.put("AC Chair", 56);      // 56 seats
        bogieCapacityMap.put("First Class", 40);   // 40 seats

        // Iterate through the map and display bogie capacities
        System.out.println("Bogie capacity details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        // Program continues...
        System.out.println("System ready for further operations...");
    }
}