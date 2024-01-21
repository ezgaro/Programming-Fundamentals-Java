import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String , String> phoneBook = new HashMap<>();
        while(!input.equals("search")) {
            String[] contactsInput = input.split("-");
            String name = contactsInput[0];
            String phoneNumber = contactsInput[1];

            phoneBook.put(name , phoneNumber);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("stop")) {
            String currentName = input;
            if(phoneBook.containsKey(currentName)) {
                System.out.printf("%s -> %s%n" , currentName , phoneBook.get(currentName));
            } else {
                System.out.printf("Contact %s does not exist.%n" , currentName);
            }


            input = scanner.nextLine();
        }
    }
}