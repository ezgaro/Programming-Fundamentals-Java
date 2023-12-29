import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Stack<String> stack = new Stack<>();

        for(int i = 0 ; i < n ; i++) {
            String line = scanner.nextLine();

            if (line.equals("(")) {
                if (!stack.isEmpty() && stack.peek().equals("(")) {
                    System.out.println("UNBALANCED");
                    return;
                }
                stack.push(line);
            } else if (line.equals(")")) {
                if (stack.isEmpty() || !stack.peek().equals("(")) {
                    System.out.println("UNBALANCED");
                    return;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
