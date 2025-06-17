public class Challenge8 {
    public static void main(String[] args) {
        // Array of order codes
        String[] orderCodes = {"X101", "B202", "Y303", "B404", "Z505", "B606", "A707", "B808"};

        // Display only the order codes that start with 'B'
        System.out.println("Filtered Order Codes (Starting with 'B'):");
        for (String code : orderCodes) {
            if (code.charAt(0) == 'B') {
                System.out.println(code);
            }
        }
    }
}
