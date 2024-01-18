import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] inputArr = input.split(" ");
        for(int i = 0 ; i <= inputArr.length - 1; i++) {
            stack.push(inputArr[i]);
        }

        for(int i = inputArr.length - 1 ; i >= 0 ; i--) {
            System.out.print(stack.pop() + " ");
        }
    }
}