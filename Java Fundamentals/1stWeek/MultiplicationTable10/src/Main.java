import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;

        while(i <= 10){
            System.out.printf("%d * %d = %d%n" , n , i , (n*i));
            i++;
        }
    }
}