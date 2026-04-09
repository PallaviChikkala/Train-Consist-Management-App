// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    private String type;   // e.g., Rectangular, Cylindrical
    private String cargo;  // e.g., Coal, Petroleum

    public GoodsBogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    // Cargo assignment with safety validation
    public void assignCargo(String cargo) {
        try {
            if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe assignment: Petroleum cannot be carried in a Rectangular bogie!");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " → " + cargo);
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for bogie type: " + type);
        }
    }

    @Override
    public String toString() {
        return type + " → Cargo: " + (cargo == null ? "None" : cargo);
    }
}

// Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");

        // Safe assignment
        cylindrical.assignCargo("Petroleum");

        // Unsafe assignment
        rectangular.assignCargo("Petroleum");

        // Continue program safely
        System.out.println("\nFinal bogie states:");
        System.out.println(rectangular);
        System.out.println(cylindrical);

        System.out.println("\nSystem ready for further operations...");
    }
}