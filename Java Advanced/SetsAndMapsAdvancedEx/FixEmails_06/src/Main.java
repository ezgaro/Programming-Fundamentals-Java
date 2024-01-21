import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Map<String, String> emails = new LinkedHashMap<>();


        while(!name.equals("stop")) {
            String email = scanner.nextLine();

            if(!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")) {
                emails.put(name , email);
            }
            name = scanner.nextLine();
        }

        emails.forEach((key , value) -> System.out.printf("%s -> %s%n", key , value));
    }
}