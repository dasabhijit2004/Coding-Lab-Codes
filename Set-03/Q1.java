// program to convert a binary number to octal number.

public class Q1 {
    public static void main(String[] args) {
        // Validate command-line arguments
        if (args.length != 1) {
            System.out.println("ERROR");
            return;
        }
        
        String binaryStr = args[0];
        
        // Check for invalid characters (only 0s and 1s allowed)
        if (!binaryStr.matches("[01]+")) {
            System.out.println("ERROR");
            return;
        }
        
        try {
            // Convert binary to decimal
            int decimal = Integer.parseInt(binaryStr, 2);
            
            // Convert decimal to octal
            String octal = Integer.toOctalString(decimal);
            
            // Print the octal number
            System.out.println(octal);
        } catch (NumberFormatException e) {
            System.out.println("ERROR");
        }
    }
}
