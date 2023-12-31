import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];

        for (int row = 1; row <= rows; row++) {
            String[] numbers = scanner.nextLine().split(" ");
            String firstNumber = numbers[0];
            String secondNumber = numbers[1];

            if(row % 2 == 0) {
                secondArray[row - 1] = firstNumber;
                firstArray[row - 1] = secondNumber;
            } else {
                secondArray[row - 1] = secondNumber;
                firstArray[row - 1] = firstNumber;
            }
        }

        System.out.println(String.join(" " , firstArray));
        System.out.println(String.join(" " , secondArray));
    }
}