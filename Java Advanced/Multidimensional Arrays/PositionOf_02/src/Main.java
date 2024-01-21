import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[rows][cols];



        for (int i = 0; i < rows; i++) {
            String[] columData = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(columData[j]);
            }
        }

        int search = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == search) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }

        if(!isFound) {
            System.out.println("not found");
        }
    }
}