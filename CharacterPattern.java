public class CharacterPattern {

    private String[] pattern;

    public CharacterPattern(String[] pattern) {
        this.pattern = pattern;
    }

    public String getLine(int index) {
        return pattern[index];
    }
}