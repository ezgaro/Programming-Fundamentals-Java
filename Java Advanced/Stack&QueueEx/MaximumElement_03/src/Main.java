import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0 ; i < n ; i++) {
            String input = scanner.nextLine();
            if(input.contains("1")) {
                int pushedNumber = Integer.parseInt(input.split(" ")[1]);
                stack.push(pushedNumber);
            } else if (input.contains("2")) {
                stack.pop();
            } else if (input.contains("3")) {
                int maxNumber = Collections.max(stack);
                System.out.println(maxNumber);
            }
        }
    }
}