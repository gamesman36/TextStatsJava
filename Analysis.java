import java.util.HashMap;
import java.util.Map;

public class Analysis {
    private String text;
    private String alphabet;
    private Map<Character, Integer> counters;
    private int totalLetters;

    public Analysis(String text) {
        this.text = text.toLowerCase();
        this.alphabet = "abcdefghijklmnopqrstuvwxyz";
        this.counters = new HashMap<>();
        totalLetters = 0;

        for (char ch : alphabet.toCharArray()) {
            counters.put(ch, 0);
        }
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void countChars() {
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lowercaseChar = Character.toLowerCase(ch);
                counters.put(lowercaseChar, counters.getOrDefault(lowercaseChar, 0) + 1);
                totalLetters++;
            }
        }
    }

    public int getCharCount(char ch) {
        return counters.getOrDefault(ch, 0);
    }

    protected int getTotalLetters() {
        return totalLetters;
    }
}