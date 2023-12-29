import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double britishPound = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.3f" , britishPound * 1.36);
    }
}