public class FrequencyAnalysis extends Analysis {

    FrequencyAnalysis(String text) {
        super(text);
    }

    public double getPercentage(char ch) {
        int charCount = getCharCount(ch);
        int totalLetters = getTotalLetters();
        if (totalLetters == 0) {
            return 0.0;
        }
        return (double) charCount / totalLetters * 100;
    }
}
