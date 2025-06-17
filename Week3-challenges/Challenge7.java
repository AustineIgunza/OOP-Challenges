import java.util.Random;

public class Challenge7 {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Create an array to store 5 order IDs
        String[] orderIDs = new String[5];

        // Generate 5 order IDs
        for (int i = 0; i < orderIDs.length; i++) {
            // Pick a random letter from F to J (instead of A–E)
            char prefix = (char)(random.nextInt(5) + 'F');

            // Generate a 3-digit number between 100 and 999
            int number = random.nextInt(900) + 100;

            // Combine prefix and number
            orderIDs[i] = prefix + "-" + number;
        }

        // Print the generated order IDs
        System.out.println("Order IDs:");
        for (String id : orderIDs) {
            System.out.println(id);
        }
    }
}
