import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstRowInput = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstRowInput[0]); //Elements to push to the stack.
        int s = Integer.parseInt(firstRowInput[1]); //Elements to pop from the stack.
        int x = Integer.parseInt(firstRowInput[2]); //Is this number in the stack ?
        int countCoincidence = 0;
        int minValue = Integer.MAX_VALUE;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int count = 0; count < n; count++) {
            stack.push(scanner.nextInt());
        }
        for (int count = 0; count < s; count++) {
            stack.pop();
        }

        if(stack.contains(x)) {
            System.out.println("true");
        } else {
            if(stack.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}