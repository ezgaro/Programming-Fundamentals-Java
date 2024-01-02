import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleChar(text);
    }

    private static void printMiddleChar(String text) {
        int strLength = text.length();
        if(strLength % 2 != 0) {
            int position = strLength / 2;
            System.out.println(text.charAt(position));
        } else {
            int position1 = strLength / 2 -1;
            int position2 = strLength / 2;
            System.out.println(text.charAt(position1) +""+ text.charAt(position2));
        }
    }
}