import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isValid = true;

        isValid = passwordLength(password, isValid);
        isValid = passwordConsistency(password, isValid);
        isValid = passwordDigits(password, isValid);

        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    private static boolean passwordConsistency(String password, boolean isValid) {
        if(!password.matches("[a-zA-Z0-9]*")) {
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }
        return isValid;
    }

    public static boolean passwordLength(String password, boolean isValid) {
        if(!(password.length() >= 6 && password.length() <= 10 )) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }
        return isValid;
    }

    public static boolean passwordDigits(String password, boolean isValid) {
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }
        return isValid;
    }
}