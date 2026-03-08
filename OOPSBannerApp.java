import java.util.HashMap;

public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });

        charMap.put('P', new String[]{
                " ******  ",
                " **   ** ",
                "**     **",
                "******   ",
                "**       ",
                "**       ",
                "**       "
        });

        charMap.put('S', new String[]{
                "  *****  ",
                " **   ** ",
                "**       ",
                "  *****  ",
                "       **",
                " **   ** ",
                "  *****  "
        });

        return charMap;
    }

    /**
     * Displays the banner message using the character map
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder row = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);
                row.append(pattern[line]).append(" ");

            }

            System.out.println(row);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}