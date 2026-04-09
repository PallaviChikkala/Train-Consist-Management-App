import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private String type;   // Passenger or Goods
    private int capacity;

    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + type + ") → Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create a list of bogies (Passenger + Goods)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 40));
        bogies.add(new Bogie("Rectangular", "Goods", 1000));
        bogies.add(new Bogie("Cylindrical", "Goods", 800));

        // Group bogies by type using Collectors.groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Display grouped bogies
        System.out.println("Grouped bogies by type:");
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println(type + ":");
            bogieList.forEach(System.out::println);
        });

        // Program continues...
        System.out.println("\nSystem ready for further operations...");
    }
}