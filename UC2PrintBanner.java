import java.util.HashMap;
import java.util.Map;

public class UC2PrintBanner {

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern(new String[]{
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        }));

        patternMap.put('P', new CharacterPattern(new String[]{
            " ******  ",
            " **   ** ",
            "**     **",
            "******   ",
            "**        ",
            "**        ",
            "**        "
        }));

        patternMap.put('S', new CharacterPattern(new String[]{
            "  *****  ",
            " **   ** ",
            "**        ",
            "  *****  ",
            "       **",
            " **   ** ",
            "  *****  "
        }));

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(patternMap.get(c).getLine(i));
            }
            System.out.println();
        }
    }
}