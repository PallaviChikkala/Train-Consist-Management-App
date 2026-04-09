import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial train consist: " + trainConsist);

        // Insert Pantry Car at position 2 (index-based insertion)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2: " + trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removing first and last bogie: " + trainConsist);

        // Final ordered train consist
        System.out.println("Final ordered train consist: " + trainConsist);

        // Program continues...
        System.out.println("System ready for further operations...");
    }
}