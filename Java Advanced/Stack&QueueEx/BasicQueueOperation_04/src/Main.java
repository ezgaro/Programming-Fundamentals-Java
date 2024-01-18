import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //number to enqueue(add)
        int s = scanner.nextInt(); //numbers to dequeue(remove/poll)
        int x = scanner.nextInt(); //check if the number is present to the queue

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int count = 0; count < n; count++) {
            queue.add(scanner.nextInt());
        }

        for (int count = 0; count < s; count++) {
            queue.remove();
        }

        if(queue.isEmpty()) {
            System.out.println("0");
        } else if (queue.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }

    }
}