import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] battleField = new char[n][n];

        int submarineCol = 0;
        int submarineRow = 0;
        //Fill the matrix
        for (int row = 0; row < n; row++) {
            char[] arrRow = scanner.nextLine().toCharArray();
            battleField[row] = arrRow;
            for (int col = 0; col < n; col++) {
                if (battleField[row][col] == 'S') {
                    submarineRow = row;
                    submarineCol = col;
                }
            }
        }


        int submarineHits = 0;
        int cruiserHits = 0;

        while (submarineHits < 3 && cruiserHits < 3) {
            String command = scanner.nextLine();
            battleField[submarineRow][submarineCol] = '-';
            switch (command) {
                case "up":
                    submarineRow--;
                    break;
                case "down":
                    submarineRow--;
                    break;
                case "left":
                    submarineCol--;
                    break;
                case "right":
                    submarineCol++;
                    break;
            }
            if(battleField[submarineRow][submarineCol] == '-') {
                battleField[submarineRow][submarineCol] = 'S';
            } else if(battleField[submarineRow][submarineCol] == '*'){
                battleField[submarineRow][submarineCol] = 'S';
                submarineHits++;
            } else if(battleField[submarineRow][submarineCol] == 'S') {
                battleField[submarineRow][submarineCol] = 'S';
                cruiserHits++;
            }
        }
        if(submarineHits == 3) {
            System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!\n" , submarineRow , submarineCol);
        } else {
            System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
        }

        //Print the matrix
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(battleField[row][col]);
            }
            System.out.println();
        }


    }
}