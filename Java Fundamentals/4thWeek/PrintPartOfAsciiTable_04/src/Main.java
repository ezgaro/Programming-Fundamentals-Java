import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startIndex = Integer.parseInt(scanner.nextLine());
        int endIndex = Integer.parseInt(scanner.nextLine());

        for(int i = startIndex ; i <= endIndex ; i++) {
            char ch = (char) i;
            System.out.print(ch + " ");
        }
    }
}