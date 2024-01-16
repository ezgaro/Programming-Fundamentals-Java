import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNumber = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while(decimalNumber != 0) {
            stack.push(decimalNumber % 2);
            decimalNumber = decimalNumber / 2;
        }
        for(Integer e: stack) {
            e = stack.pop();
            System.out.print(e);
        }
    }
}