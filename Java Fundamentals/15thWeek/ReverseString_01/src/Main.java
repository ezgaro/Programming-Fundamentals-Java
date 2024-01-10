import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while(!input.equals("end")) {
            String reversedStr = "";
            for(int i =input.length() - 1 ; i >= 0 ;i-- ) {
                char charSymbol = input.charAt(i);
                reversedStr+=charSymbol;
            }
            System.out.printf("%s = %s%n " , input, reversedStr);
            input = scanner.nextLine();
        }
        System.out.println();
    }
}