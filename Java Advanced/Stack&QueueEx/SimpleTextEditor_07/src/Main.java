import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentResult = new StringBuilder();
        //We will have to remember the LAST 1 or 2 operation, so we will use STACK.
        ArrayDeque<String> stack = new ArrayDeque<>();
        for(int i = 0 ; i < n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            int commandNum = Integer.parseInt(input[0]);
            if(commandNum == 1) {
                stack.push(currentResult.toString());

                String stringToAppend = input[1];
                currentResult.append(stringToAppend);
            } else if (commandNum == 2) {
                stack.push(currentResult.toString());

                int countCharsToErase = Integer.parseInt(input[1]);
                currentResult.delete(currentResult.length() - countCharsToErase, currentResult.length());
            } else if(commandNum == 3) {
                int index = Integer.parseInt(input[1]);
                if(index > 0 && index <= currentResult.length()) {
                    System.out.println(currentResult.charAt(index - 1));
                }
            } else if (commandNum == 4) {
                if(!stack.isEmpty()) {
                    String last = stack.pop();
                    currentResult = new StringBuilder(last);
                }
            }
        }

    }
}