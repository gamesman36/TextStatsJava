import java.util.HashMap;
import java.util.Map;

public class Analysis {
    private String text;
    private String alphabet;
    private Map<Character, Integer> counters;

    public Analysis(String text) {
        this.text = text.toLowerCase();
        this.alphabet = "abcdefghijklmnopqrstuvwxyz";
        this.counters = new HashMap<>();

        for (char ch : alphabet.toCharArray()) {
            counters.put(ch, 0);
        }
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void countChars() {
        for (char ch : text.toCharArray()) {
            if (counters.containsKey(ch)) {
                counters.put(ch, counters.get(ch) + 1);
            }
        }
    }

    public int getCharCount(char ch) {
        return counters.getOrDefault(ch, 0);
    }
}