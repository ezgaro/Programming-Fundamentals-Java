import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");
        int row = Integer.parseInt(parts[0]);
        int col = Integer.parseInt(parts[1]);


        int[][] data = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] rowNum = scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                data[i][j] = Integer.parseInt(rowNum[j]);
            }
        }


        parts = scanner.nextLine().split(" ");
        int secRow = Integer.parseInt(parts[0]);
        int secCol = Integer.parseInt(parts[1]);


        int[][] secData = new int[secRow][secCol];

        for (int i = 0; i < secRow; i++) {
            String[] rowNum = scanner.nextLine().split(" ");
            for (int j = 0; j < secCol; j++) {
                secData[i][j] = Integer.parseInt(rowNum[j]);
            }
        }


        if(row != secRow || col != secCol) {
            System.out.println("not equal");
            return;
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(data[i][j] != secData[i][j]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }

        System.out.println("equal");
    }
}