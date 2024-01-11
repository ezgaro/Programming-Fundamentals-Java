import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(", ");
        for (String currentText : text) {
            if(validUsername(currentText)){
                System.out.println(currentText);
            }
        }
    }
    public static boolean validUsername (String username) {
        boolean isValidLength = username.length() >= 3 && username.length() <= 16;
        for (char  symbol : username.toCharArray()) {
            if(!(Character.isLetter(symbol) || Character.isDigit(symbol) || symbol == '-' || symbol == '_')) {
                return false;
            }
        }
        return isValidLength;
    }
}