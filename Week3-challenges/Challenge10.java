import java.util.Arrays;

public class Challenge10 {
    public static void main(String[] args) {
        // Create an array of box labels
        String[] boxes = { "X21", "Y35", "Z18", "W44" };

        System.out.println();

        // Show the last element in lowercase before clearing
        System.out.println("Before clear: " + boxes[3].toLowerCase());

        // Clear (set to null) the last 2 elements
        Arrays.fill(boxes, 2, 4, null);

        // Check and print the last element after clearing
        if (boxes[3] != null) {
            System.out.println("After clear: " + boxes[3].toLowerCase());
        } else {
            System.out.println("After clear: null");
        }

        // Print the array length and updated content
        System.out.println("Array size: " + boxes.length);
        for (String box : boxes) {
            System.out.println(">> " + box);
        }
    }
}
