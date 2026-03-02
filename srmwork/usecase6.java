package srmwork;

public class usecase6 {
 

    public static void main(String[] args) {

        // Get patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Banner array to store final output
        String[] banner = new String[7];

        // Combine patterns line by line
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    private static String[] getOPattern() {

        return new String[] {

                "  *****   ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                "  *****   "
        };
    }

    // Helper method for letter P
    private static String[] getPPattern() {

        return new String[] {

                "  ******  ",
                " *     *  ",
                " *     *  ",
                "  ******  ",
                " *        ",
                " *        ",
                " *        "
        };
    }

    // Helper method for letter S
    private static String[] getSPattern() {

        return new String[] {

                "  ******  ",
                " *        ",
                " *        ",
                "  *****   ",
                "       *  ",
                " *     *  ",
                "  *****   "
        };
    }
}

