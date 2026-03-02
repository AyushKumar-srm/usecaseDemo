

public class usecase7 {

    public static class CharacterPattern {

        // Instance variables (Encapsulation)
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character the character
         * @param pattern   7-line banner representation
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         *
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         *
         * @return 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /* ==========================
       Utility Methods (Patterns)
       ========================== */

    private static String[] buildOPattern() {
        return new String[]{
                "  *****   ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                "  *****   "
        };
    }

    private static String[] buildPPattern() {
        return new String[]{
                "  ******  ",
                " *     *  ",
                " *     *  ",
                "  ******  ",
                " *        ",
                " *        ",
                " *        "
        };
    }

    private static String[] buildSPattern() {
        return new String[]{
                "  ******  ",
                " *        ",
                " *        ",
                "  *****   ",
                "       *  ",
                " *     *  ",
                "  *****   "
        };
    }

    /* ==========================
              Main Method
       ========================== */

    public static void main(String[] args) {

        // Create objects (Array of Objects)
        CharacterPattern[] characters = {
                new CharacterPattern('O', buildOPattern()),
                new CharacterPattern('P', buildPPattern()),
                new CharacterPattern('S', buildSPattern())
        };

        // Word to display
        char[] word = {'O', 'O', 'P', 'S'};

        // Build banner line by line
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char letter : word) {
                for (CharacterPattern cp : characters) {
                    if (cp.getCharacter() == letter) {
                        lineBuilder.append(cp.getPattern()[row]);
                    }
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }
}

