public class OOPSBannerApp {

    /**
     * CharacterPatternMap – Inner class for storing character-to-pattern mappings
     */
    static class CharacterPatternMap {

        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Create pattern map objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                " ******  ",
                " **   ** ",
                "**     **",
                "******   ",
                "**       ",
                "**       ",
                "**       "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                "  *****  ",
                " **   ** ",
                "**       ",
                "  *****  ",
                "       **",
                " **   ** ",
                "  *****  "
        });

        CharacterPatternMap spacePattern = new CharacterPatternMap(' ', new String[]{
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
        });

        return new CharacterPatternMap[]{
                oPattern, pPattern, sPattern, spacePattern
        };
    }

    /**
     * Get pattern for a character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Print banner message
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append(" ");

            }

            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}