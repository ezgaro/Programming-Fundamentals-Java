import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        //Square matrix
        int[][] matrix = new int[size][size];
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int rows = 0; rows < size; rows++) {
            String[] lines = scanner.nextLine().split(" ");
            for (int cols = 0; cols < size; cols++) {
                matrix[rows][cols] = Integer.parseInt(lines[cols]);
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(row == col) {
                    primaryDiagonalSum += matrix[row][col];
                }
            }
        }

        for (int row = size - 1, col = 0;col < size && row >= 0; row--, col++) {
            secondaryDiagonalSum += matrix[row][col];
        }

        int result = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
        System.out.println(result);
    }
}