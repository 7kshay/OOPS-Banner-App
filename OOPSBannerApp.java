/**
 * OOPSBannerApp UC3 – Banner Display using String.join()
 *
 * Refactored version of UC2 to improve memory efficiency
 * by replacing string concatenation with String.join().
 *
 * Maintains the same visual banner output.
 *
 * @author Akshay
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("",
                "  *****   ",
                "  *****   ",
                " ******   ",
                "  *****   "
        ));

        System.out.println(String.join("",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *        "
        ));

        System.out.println(String.join("",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *        "
        ));

        System.out.println(String.join("",
                " *     *  ",
                " *     *  ",
                " ******   ",
                "  *****   "
        ));

        System.out.println(String.join("",
                " *     *  ",
                " *     *  ",
                " *        ",
                "       *  "
        ));

        System.out.println(String.join("",
                " *     *  ",
                " *     *  ",
                " *        ",
                "       *  "
        ));

        System.out.println(String.join("",
                "  *****   ",
                "  *****   ",
                " *        ",
                "  *****   "
        ));
    }
}
