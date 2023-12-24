import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sumFirst = 0;
        int sumSec = 0;

        for(int i = 0 ; i < n ; i++) {
            int num = Integer.parseInt(sc.nextLine());
            sumFirst+=num;
        }

        for(int i = 0 ; i < n ; i++) {
            int num2 = Integer.parseInt(sc.nextLine());
            sumSec+=num2;
        }

        if(sumFirst == sumSec) {
            System.out.println("Yes, sum = " + sumSec);
        } else {
            System.out.println("No, diff = " + Math.abs(sumSec - sumFirst));
        }
    }
}