
import java.util.HashMap;
import java.util.Map;

public class usecase8 {

    /* ==========================
       Utility Method 1
       Build Character Pattern Map
       ========================== */

    /**
     * Builds and returns a HashMap containing
     * character patterns for O, P, S
     *
     * @return Map of character to 7-line pattern
     */
    private static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  *****   ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                "  *****   "
        });

        patternMap.put('P', new String[]{
                "  ******  ",
                " *     *  ",
                " *     *  ",
                "  ******  ",
                " *        ",
                " *        ",
                " *        "
        });

        patternMap.put('S', new String[]{
                "  ******  ",
                " *        ",
                " *        ",
                "  *****   ",
                "       *  ",
                " *     *  ",
                "  *****   "
        });

        return patternMap;
    }

    /* ==========================
       Utility Method 2
       Render Banner Message
       ========================== */

    /**
     * Renders banner message using provided map
     *
     * @param message Word to display
     * @param patternMap Map containing character patterns
     */
    private static void renderBanner(String message,
                                     Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char letter : message.toCharArray()) {

                String[] pattern = patternMap.get(letter);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]);
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /* ==========================
              Main Method
       ========================== */

    public static void main(String[] args) {

        // Step 1: Build Map
        Map<Character, String[]> patternMap = buildCharacterMap();

        // Step 2: Define Message
        String message = "OOPS";

        // Step 3: Render Banner
        renderBanner(message, patternMap);
    }
}