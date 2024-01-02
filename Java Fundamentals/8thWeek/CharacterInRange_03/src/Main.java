import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startChar = scanner.next().charAt(0);
        char endChar = scanner.next().charAt(0);
        printCharsInRange(startChar, endChar);
    }

    public static void printCharsInRange(char startChar, char endChar) {
        if(startChar > endChar) {
            for(char symbol = (char)(endChar + 1) ; symbol < startChar ; symbol++) {
                System.out.println(symbol + " ");
            }
        } else {
            for (char symbol = (char)(startChar + 1) ; symbol < endChar ; symbol++) {
                System.out.println(symbol + " ");
            }
        }
    }
}