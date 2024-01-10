import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String currentBannedWord : bannedWords) {
            StringBuilder replacement = new StringBuilder("*");
            for (int j = 1; j < currentBannedWord.length(); j++) {
                replacement.append("*");
            }
            text = text.replace(currentBannedWord, replacement.toString());
        }
        System.out.println(text);
    }
}