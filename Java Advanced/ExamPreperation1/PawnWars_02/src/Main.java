import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[8][8];
        //read the matrix
        for(int i = 0 ; i < 8; i++) {
            String line = scanner.nextLine();
            for(int j = 0; j < 8 ;j ++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        //Claim the index of w ,b
        int startBIndexRow = 0;
        int startBIndexCol = 0;
        int startWIndexRow = 0;
        int startWIndexCol = 0;
        for(int i = 0 ; i < 8 ;i++) {
            for(int j = 0 ; j < 8 ; j++) {
                if(matrix[i][j] == 'b') {
                    startBIndexRow = i;
                    startBIndexCol = j;
                } else if (matrix[i][j] == 'w') {
                    startWIndexRow = i;
                    startWIndexCol = j;
                }
            }
        }
        int currentBIndexRow = startBIndexRow;
        int currentWIndexRow = startWIndexRow;
        int currentBIndexCol = startBIndexCol;
        int currentWIndexCol = startWIndexCol;
        char charLetter = 'a';

        //Who's turn it is now
        int turnCounter = 0;
        while(true) {
            //Increment and decrement ,currentBIndexRow and currentWIndexRow every rotation of the while loop
            //Check if they are in adjacent cols
            if(currentWIndexCol == currentBIndexCol - 1 || currentWIndexCol == currentBIndexCol + 1){
                //They are in adjacent cols
                //Check if they are in adjacent rows
                if(currentWIndexRow == currentBIndexRow - 1 || currentWIndexRow == currentBIndexRow + 1) {
                    //Check whose turn it is and kill other pawn
                    if(turnCounter % 2 == 0) {
                        //It is whites turn
                        currentWIndexRow = currentBIndexRow;
                        currentWIndexCol = currentBIndexCol;
                        currentWIndexRow = subMethodRows(currentWIndexRow);
                        charLetter = placeCheckerCol(currentWIndexCol,charLetter);
                        System.out.printf("Game over! White capture on %c%d.", charLetter,currentWIndexRow);
                        break;
                    } else {
                        //It is blacks turn
                        currentBIndexRow = currentWIndexRow;
                        currentBIndexCol = currentWIndexCol;
                        currentBIndexRow = subMethodRows(currentBIndexRow);
                        charLetter = placeCheckerCol(currentBIndexCol,charLetter);
                        System.out.printf("Game over! White capture on %c%d.", charLetter,currentBIndexRow);
                        break;
                    }
                }
            } else {
                //They are not adjacent cols
                int distanceToFinalW = currentWIndexRow;
                int distanceToFinalB = 7 - currentBIndexRow;

                if(distanceToFinalW <= distanceToFinalB ) {
                    charLetter = placeCheckerCol(currentWIndexCol, charLetter);
                    System.out.printf("Game over! White pawn is promoted to a queen at %c8.", charLetter);
                    break;
                } else {
                    charLetter = placeCheckerCol(currentBIndexCol, charLetter);
                    System.out.printf("Game over! Black pawn is promoted to a queen at %c1.", charLetter);
                    break;
                }
            }
            currentBIndexRow++;
            currentWIndexRow--;
            turnCounter++;
        }


    }

    public static char placeCheckerCol(int currentWIndexCol, char charLetter) {
        int Col = currentWIndexCol;
        char ch = charLetter;

        if(Col == 0) {
            ch = 'a';
        } else if (Col == 1) {
            ch = 'b';
        } else if (Col == 2) {
            ch = 'c';
        } else if (Col == 3) {
            ch = 'd';
        } else if (Col == 4) {
            ch = 'e';
        } else if (Col == 5) {
            ch = 'f';
        }  else if (Col == 6) {
            ch = 'g';
        } else if (Col == 7) {
            ch = 'h';
        }

        return ch;
    }

    public static int subMethodRows(int Row) {
        if(Row == 0) {
            Row = 8;
        } else if (Row == 1) {
            Row = 7;
        } else if (Row == 2) {
            Row = 6;
        } else if (Row == 3) {
            Row = 5;
        }else if (Row == 4) {
            Row = 4;
        }else if (Row == 5) {
            Row = 3;
        } else if (Row == 6) {
            Row = 2;
        }  else if (Row == 7) {
            Row = 1;
        }
        return Row;
    }
}

//--------
//-------b
//--------
//--------
//--------
//--------
//--------
//w-------



