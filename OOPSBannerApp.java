import java.util.HashMap;

/**
 * OOPSBannerApp - Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap thereby enhancing code organization and modularity.
 *
 * @author 7kshay
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     *
     * Each character is mapped to an array of strings where each string represents
     * one line of the character's ASCII art pattern. All patterns are assumed to have
     * the same height.
     *
     * @return a HashMap where keys are characters (char) and values are String arrays
     *         representing the ASCII art pattern lines for each character
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        // Create a HashMap to store character patterns
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            "  ***  ",
            " **  ** ",
            "**    **",
            "**    **",
            "**    **",
            " **  ** ",
            "  ***  "
        });

        charMap.put('P', new String[] {
            "*****  ",
            "**  ** ",
            "**  ** ",
            "*****  ",
            "**     ",
            "**     ",
            "**     "
        });

        charMap.put('S', new String[] {
            " *****",
            "**    ",
            "**    ",
            " **** ",
            "    **",
            "    **",
            " *****"
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     *
     * This method renders the input message as a large ASCII art banner by iterating
     * through each line of the character patterns and horizontally concatenating the
     * corresponding line from each character in the message.
     *
     * @param message  the String message to display as a banner. Each character must
     *                 exist as a key in the charMap
     * @param charMap  a HashMap containing character patterns, where each character
     *                 maps to a String array of pattern lines
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Getting pattern height. Assuming all patterns have the same height
        int patternHeight = charMap.get('O').length;

        // Loop through each line of the pattern height and build the banner line by line
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append("  ");
            }
            System.out.println(sb.toString());
        }
    }

    /**
     * Main entry point of the application.
     *
     * Initializes the character map, defines a message, and displays it as an ASCII
     * art banner to the console.
     *
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}