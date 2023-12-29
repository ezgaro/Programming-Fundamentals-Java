import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        String result = "";

        for(int i = 0 ; i < k ; i++) {
            char ch = scanner.nextLine().charAt(0);
            result += (char)(ch + n);
        }
        System.out.println(result);
    }
}