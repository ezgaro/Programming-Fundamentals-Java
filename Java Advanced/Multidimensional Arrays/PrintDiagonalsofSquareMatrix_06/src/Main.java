import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();
          int[][] matrix = new int[size][]; //Only giving space(memory) for the array so his values will be null!
//        int[][] matrix = new int[size][size]; The values have separate addresses ([I@182340192...) so it's values are going to be 0!
        for (int row = 0; row < size; row++) {
            String[] columnData = scanner.nextLine().split(" ");
//            int[] currentRow = new int[size];
//            for (int col = 0; col < size; col++) {
//                currentRow[col] = Integer.parseInt(columnData[col]);
//            }
            int[] currentRow = Arrays.stream(columnData)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = currentRow;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int row = size - 1, col = 0; col < size ; row--,col++) {
            System.out.print(matrix[row][col] + " ");
        }
    }
}