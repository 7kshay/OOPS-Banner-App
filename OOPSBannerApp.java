/**
 * OOPSBannerApp
 * 
 * UC4: Render OOPS as Banner using String Array and Loop
 *
 * @author Akshay
 * @version 1.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point of the application
     */
    public static void main(String[] args) {

        String[] lines = new String[7];

        lines[0] = String.join(" ", " *** ", " *** ", " ***** ", " ***** ");
        lines[1] = String.join(" ", "** **", "** **", "**    ", "**    ");
        lines[2] = String.join(" ", "** **", "** **", "**    ", "**    ");
        lines[3] = String.join(" ", "** **", "** **", "***** ", " ***  ");
        lines[4] = String.join(" ", "** **", "** **", "**    ", "   ** ");
        lines[5] = String.join(" ", "** **", "** **", "**    ", "   ** ");
        lines[6] = String.join(" ", " *** ", " *** ", "**    ", "***** ");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}