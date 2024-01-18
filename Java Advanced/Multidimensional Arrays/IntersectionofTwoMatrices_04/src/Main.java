import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine();

        char[][] A = new char[M][N];
        char[][] B = new char[M][N];
        char[][] C = new char[M][N];

        //Read A matrix
        for (int i = 0; i < A.length; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = parts[j].charAt(0);
            }
        }


        //Read B matrix
        for (int i = 0; i < B.length; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = parts[j].charAt(0);
            }
        }


        //Fill in C matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(A[i][j] == B[i][j]) {
                    C[i][j] = A[i][j];
                } else {
                    C[i][j] = '*';
                }
            }
        }
        //Print C matrix
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}