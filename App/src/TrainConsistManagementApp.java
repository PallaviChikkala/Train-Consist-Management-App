import java.util.ArrayList;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " → Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 40));

        // Display bogies
        System.out.println("Passenger bogies:");
        passengerBogies.forEach(System.out::println);

        // Use Stream API to calculate total seating capacity
        int totalSeats = passengerBogies.stream()
                .map(Bogie::getCapacity)          // extract capacity
                .reduce(0, Integer::sum);         // sum capacities

        // Display total seating capacity
        System.out.println("\nTotal seating capacity in train: " + totalSeats);

        // Program continues...
        System.out.println("System ready for further operations...");
    }
}