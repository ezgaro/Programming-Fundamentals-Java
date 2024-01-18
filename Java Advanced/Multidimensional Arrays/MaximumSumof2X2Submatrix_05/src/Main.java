import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] table = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                table[i][j] = Integer.parseInt(line[j]);
            }
        }


        int maxSumTopLeftRow =  -1;
        int maxSumTopLeftCol =  -1;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < table.length - 1; i++) {
            for (int j = 0; j < table[i].length - 1; j++) {
                int currentSum = table[i][j] + table[i][j + 1] + table[i + 1][j] + table[i + 1][j + 1];
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSumTopLeftRow = i;
                    maxSumTopLeftCol = j;
                }
            }
        }


        System.out.println(table[maxSumTopLeftRow][maxSumTopLeftCol] + " " + table[maxSumTopLeftRow][maxSumTopLeftCol + 1]);
        System.out.println(table[maxSumTopLeftRow + 1][maxSumTopLeftCol] + " " + table[maxSumTopLeftRow + 1][maxSumTopLeftCol + 1]);
        System.out.println(maxSum);
    }
}