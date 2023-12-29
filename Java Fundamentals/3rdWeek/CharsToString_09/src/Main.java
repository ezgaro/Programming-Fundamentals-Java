import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        for(int i = 0 ; i < 3 ; i++) {
            char ch = scanner.nextLine().charAt(0);
            str = str + ch;
        }
        System.out.println(str);
    }
}