// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    private String name;
    private int capacity;

    // Constructor with validation
    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
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

// Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        try {
            // Valid bogie creation
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + sleeper);

            // Invalid bogie creation (capacity = 0)
            PassengerBogie acChair = new PassengerBogie("AC Chair", 0);
            System.out.println("Created: " + acChair);

        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }

        try {
            // Invalid bogie creation (negative capacity)
            PassengerBogie firstClass = new PassengerBogie("First Class", -10);
            System.out.println("Created: " + firstClass);

        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }

        System.out.println("\nSystem ready for further operations...");
    }
}