import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        repeatText(text ,n);
    }

    private static void repeatText(String text , int n) {
        for(int i = 0 ; i < n ; i++) {
            System.out.print(text);
        }
    }
}