import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        String currentInput = scanner.nextLine();
        while (!currentInput.equals("Home")) {
            if(currentInput.equals("back")) {
                if(history.isEmpty() || history.size() == 1) {
                    System.out.println("no previous URLs");
                } else {
                    forward.push(history.pop());
                    System.out.println(history.peek());
                }
            } else if(currentInput.equals("forward")) {
                if(forward.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    history.push(forward.pop());
                    System.out.println(history.peek());
                }
            } else {
                forward.clear();
                history.push(currentInput);
                System.out.println(history.peek());
            }
            currentInput = scanner.nextLine();
        }
    }
}