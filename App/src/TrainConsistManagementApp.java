import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (these could come from user input in a real system)
        String trainId1 = "TRN-1234";   // valid
        String trainId2 = "TRAIN12";    // invalid
        String cargoCode1 = "PET-AB";   // valid
        String cargoCode2 = "PET-ab";   // invalid

        // Define regex patterns
        Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

        // Validate Train IDs
        validateInput(trainId1, trainIdPattern, "Train ID");
        validateInput(trainId2, trainIdPattern, "Train ID");

        // Validate Cargo Codes
        validateInput(cargoCode1, cargoCodePattern, "Cargo Code");
        validateInput(cargoCode2, cargoCodePattern, "Cargo Code");

        // Program continues...
        System.out.println("\nSystem ready for further operations...");
    }

    private static void validateInput(String input, Pattern pattern, String label) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(label + " \"" + input + "\" is VALID.");
        } else {
            System.out.println(label + " \"" + input + "\" is INVALID.");
        }
    }
}