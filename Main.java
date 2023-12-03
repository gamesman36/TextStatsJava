import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        Analysis analysis = new Analysis(text);

        analysis.countChars();
        String alphabet = analysis.getAlphabet();

        for (char ch : alphabet.toCharArray()) {
            int count = analysis.getCharCount(ch);
            System.out.println("Character: " + ch + ", Count: " + count);
        }
    }
}