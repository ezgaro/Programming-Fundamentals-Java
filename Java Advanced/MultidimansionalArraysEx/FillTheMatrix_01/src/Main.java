import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String methodName = input[1];

        if(methodName.equals("A")) {
            methodA(size);
        } else {
            methodB(size);
        }
    }

    private static void methodB(int size) {
        //fill

        int[][] matrix = new int[size][size];
        int k = 1;
        for (int col = 0; col < size; col++) {
            //high to low
            if(col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = k;
                    k++;
                }
            } else {
                //low to high
                for (int row = size - 1; row > -1 ; row--) {
                    matrix[row][col] = k;
                    k++;
                }
            }
        }

        //print
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void methodA(int size) {
        int[][] matrix = new int[size][size];
        int k = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = k;
                k++;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}