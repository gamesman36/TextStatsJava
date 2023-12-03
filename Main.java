import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        FrequencyAnalysis frequencyAnalysis = new FrequencyAnalysis(text);

        frequencyAnalysis.countChars();
        String alphabet = frequencyAnalysis.getAlphabet();

        for (char ch : alphabet.toCharArray()) {
            int count = frequencyAnalysis.getCharCount(ch);
            double percentage = frequencyAnalysis.getPercentage(ch);

            String formattedPercentage = String.format("%.2f", percentage);
            System.out.println("Character: " + ch + ", Count: " + count + ", Percentage: " + formattedPercentage + "%");
        }
    }
}