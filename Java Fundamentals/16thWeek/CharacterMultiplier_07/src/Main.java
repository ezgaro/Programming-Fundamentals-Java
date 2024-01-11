import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] separatedInputs = input.split(" ");
        String firstString = separatedInputs[0];
        String secondString = separatedInputs[1];
        int totalSum = charMultiplier(firstString , secondString);
        System.out.println(totalSum);
    }


    //G e o r g e  P e t e r
    private static int charMultiplier(String firstString, String secondString) {
        int totalSum = 0;
        int minLength = Math.min(firstString.length(), secondString.length());

        for (int i = 0; i < minLength; i++) {
            totalSum += firstString.charAt(i) * secondString.charAt(i);
        }

        if (firstString.length() > minLength) {
            for (int i = minLength; i < firstString.length(); i++) {
                totalSum += firstString.charAt(i);
            }
        } else if (secondString.length() > minLength) {
            for (int i = minLength; i < secondString.length(); i++) {
                totalSum += secondString.charAt(i);
            }
        }

        return totalSum;
    }
}