import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        char ch;
        boolean isValid = false;
        int index = 0;


        for(int i = 0 ; i < username.length() ; i++) {
            ch = username.charAt(i);
            password = ch + password;
        }

        while (!isValid) {
            String currentInput = scanner.nextLine();
            if(currentInput.equals(password)) {
                isValid = true;
                System.out.printf("User %s logged in." , username);
            } else {
                System.out.println("Incorrect password. Try again.");
            }

            if(index == 4) {
                System.out.printf("User %s blocked!" , username);
            }
            index++;
        }
    }
}