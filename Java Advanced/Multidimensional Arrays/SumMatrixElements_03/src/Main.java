import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int row = Integer.parseInt(rowsAndCols[0]);
        int col = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[row][col];
        System.out.println(row);
        System.out.println(col);
        int sum = 0;

        for (int rows = 0; rows < matrix.length; rows++) {
            String[] parts = scanner.nextLine().split(", ");
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                int currentElement = Integer.parseInt(parts[cols]);
                sum+=currentElement;
            }
        }

        System.out.println(sum);
    }
}