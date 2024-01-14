import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        //Siiceercaroetavm!:?:ahsott.:i:nstupmomceqr
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            if(command.equals("TakeOdd")) {
                StringBuilder oddChars = new StringBuilder();
                for(int i = 1 ; i < password.length() ; i+=2) {
                    oddChars.append(password.charAt(i));
                }
                password = oddChars.toString();
                System.out.println(password);
            } else if (command.contains("Cut")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int length = Integer.parseInt(command.split(" ")[2]);

                String passwordToRemove = password.substring(index , index + length);
                password = password.replaceFirst(passwordToRemove , "");
                System.out.println(password);
            } else if (command.contains("Substitute")) {
                String stringToReplace = command.split(" ")[1];
                String replacingString = command.split(" ")[2];

                if(password.contains(stringToReplace)) {
                    password = password.replaceAll(stringToReplace , replacingString);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s" , password);
    }
}