import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumPrime = 0;
        int sumEven = 0;
        int even;
        int prime;
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n ; i++) {
            if(i%2 == 0) {
                even = Integer.parseInt(sc.nextLine());
                sumEven+=even;
            } else  {
                prime = Integer.parseInt(sc.nextLine());
                sumPrime+=prime;
            }
        }
        if(sumPrime == sumEven) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumPrime);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumPrime - sumEven));
        }
    }
}