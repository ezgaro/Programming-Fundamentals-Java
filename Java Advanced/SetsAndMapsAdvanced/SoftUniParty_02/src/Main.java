import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String input = scanner.nextLine();
        while(!input.equals("PARTY")) {
            boolean isVip = Character.isDigit(input.charAt(0));
            if(isVip) {
                vip.add(input);
            } else {
                regular.add(input);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while(!input.equals("END")) {
            boolean isVip = Character.isDigit(input.charAt(0));
            if(isVip) {
                vip.remove(input);
            } else {
                regular.remove(input);
            }
            input = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());
        for (String v : vip) {
            System.out.println(v);
        }
        for(String r : regular) {
            System.out.println(r);
        }
    }
}