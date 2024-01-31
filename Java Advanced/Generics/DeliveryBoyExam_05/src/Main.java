import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int rowPizzaBoy;
    public static int startRow = 0;
    public static int startCol = 0;
    public static int colPizzaBoy;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s++")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        char[][] martix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String row = scanner.nextLine();
            martix[i] = row.toCharArray();
            int index = row.indexOf('B');
            if (index != -1) {
                startRow = i;
                startCol = index;
            }
        }
        rowPizzaBoy = startRow;
        colPizzaBoy = startCol;

        boolean deliveryInProgress = true;
        while (deliveryInProgress) {
            String direction = scanner.nextLine();

            if (direction.equals("down")) {
                deliveryInProgress = move(martix , rowPizzaBoy + 1 , colPizzaBoy);
            } else if (direction.equals("up")) {
                deliveryInProgress = move(martix, rowPizzaBoy - 1, colPizzaBoy);
            } else if (direction.equals("left")) {
                deliveryInProgress = move(martix,rowPizzaBoy , colPizzaBoy - 1);
            } else if (direction.equals("right")) {
                deliveryInProgress = move(martix ,rowPizzaBoy , colPizzaBoy + 1);
            }
        }


        for (char[] chars : martix) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    private static boolean move(char[][] martix, int nextRow , int nextCol) {
        if (!isInBounds(martix, nextRow, nextCol)) {
            martix[startRow][startCol] = ' ';
            System.out.println("The delivery is late. Order is canceled.");
            return false;
        }
        if (martix[nextRow][nextCol] == '*') {
            return true;
        }
        rowPizzaBoy = nextRow;
        colPizzaBoy = nextCol;
        if (martix[nextRow][nextCol] == 'P') {
            martix[nextRow][nextCol] = 'R';
            System.out.println("Pizza is collected. 10 minutes for delivery.");
            return true;
        } else if (martix[nextRow][nextCol] == 'A') {
            martix[nextRow][nextCol] = 'P';
            System.out.println("Pizza is delivered on time! Next order...");
            return false;
        }
        if(martix[nextRow][nextCol] != 'B') {
            martix[nextRow][nextCol] = '.';
        }
        return true;
    }

    private static boolean isInBounds(char[][] martix, int nextRow, int nextCol) {
        return nextRow >= 0 && nextRow < martix.length && nextCol >= 0 && nextCol < martix[nextRow].length;
    }
}