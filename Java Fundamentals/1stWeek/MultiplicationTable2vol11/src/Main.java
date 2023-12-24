import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        int i = 1;

        do{
            System.out.printf("%d X %d = %d%n" , num , times , num*times);
            times++;

        } while (times <= 10);
    }
}