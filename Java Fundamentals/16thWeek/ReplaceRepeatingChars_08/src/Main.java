import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(input);

        for(int i = 0 ; i < stringBuilder.length() - 1 ; i++) {
            while(i < stringBuilder.length() - 1 && stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)) {
                stringBuilder.deleteCharAt(i);
            }
        }
        System.out.println(stringBuilder);
    }
}