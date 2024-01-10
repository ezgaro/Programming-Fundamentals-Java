import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(" ");
        for(int i = 0 ; i < wordsArr.length ; i++) {
            String currentStr = wordsArr[i];
            for(int j = 0; j < currentStr.length() ; j++) {
                System.out.print(currentStr);
            }
        }
    }
}