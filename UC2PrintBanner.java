public class UC2PrintBanner {

    public static void main(String[] args) {

        String[] O = {
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        };

        String[] P = {
            " ******  ",
            " **   ** ",
            "**     **",
            "******   ",
            "**        ",
            "**        ",
            "**        "
        };

        String[] S = {
            "  *****  ",
            " **   ** ",
            "**        ",
            "  *****  ",
            "       **",
            " **   ** ",
            "  *****  "
        };

        CharacterPattern letterO = new CharacterPattern(O);
        CharacterPattern letterP = new CharacterPattern(P);
        CharacterPattern letterS = new CharacterPattern(S);

        for (int i = 0; i < 7; i++) {
            System.out.println(
                letterO.getLine(i) +
                letterO.getLine(i) +
                letterP.getLine(i) +
                letterS.getLine(i)
            );
        }
    }
}