import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0 ; i < n ; i++) {
            int firstNumber = Integer.parseInt(scanner.next());
            int secondNumber = Integer.parseInt(scanner.next());
            if(firstNumber > secondNumber) {
                while(firstNumber > 0) {
                    int currentDigit = firstNumber % 10;
                    sum+=currentDigit;
                    firstNumber/=10;
                }
            } else {
                while(secondNumber > 0) {
                    int currentDigit = secondNumber % 10;
                    sum+=currentDigit;
                    secondNumber/=10;
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}