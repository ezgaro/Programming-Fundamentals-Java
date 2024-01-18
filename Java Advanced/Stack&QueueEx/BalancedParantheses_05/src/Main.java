import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();
        boolean arrBalance = false;

        for(char bracket : input.toCharArray()) {
            if(bracket == '(' || bracket == '[' || bracket == '{') {
                openBracketsStack.push(bracket);
            } else if(bracket == ')' || bracket == ']' || bracket == '}') {

                if(openBracketsStack.isEmpty()) {
                    arrBalance = false;
                    break;
                }
                char lastOpenedBracket = openBracketsStack.pop();

                if(lastOpenedBracket == '(' && bracket == ')') {
                    arrBalance = true;
                } else if(lastOpenedBracket == '[' && bracket == ']') {
                    arrBalance = true;
                } else if(lastOpenedBracket == '{' && bracket == '}') {
                    arrBalance = true;
                } else {
                    arrBalance = false;
                    break;
                }
            }
        }
        System.out.println(arrBalance ? "YES" : "NO");
    }
}