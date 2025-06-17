import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge9 {
    public static void main(String[] args) {
        // Original array of box IDs
        String[] boxes = {"C21", "B18", "C19", "B20"};

        // Sort the array in alphabetical order
        System.out.println("Boxes in Order:");
        Arrays.sort(boxes);
        for (String box : boxes) {
            System.out.println("- " + box);
        }

        // Add a visual separator
        System.out.println("\n------------------");

        // Reverse the sorted array
        System.out.println("Boxes in Reverse:");
        List<String> boxList = Arrays.asList(boxes);
        Collections.reverse(boxList);
        for (String box : boxList) {
            System.out.println("- " + box);
        }
    }
}
