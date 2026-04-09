import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("=== Train Consist Management App ===");

        // Prepare a dataset of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury", 90));
        bogies.add(new Bogie("Economy", 30));

        // Loop-based filtering
        long startLoop = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // Stream-based filtering
        long startStream = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Display results
        System.out.println("\nLoop-based filtering result:");
        loopFiltered.forEach(System.out::println);
        System.out.println("Execution time (nanoseconds): " + loopTime);

        System.out.println("\nStream-based filtering result:");
        streamFiltered.forEach(System.out::println);
        System.out.println("Execution time (nanoseconds): " + streamTime);

        // Program continues...
        System.out.println("\nSystem ready for further operations...");
    }
}