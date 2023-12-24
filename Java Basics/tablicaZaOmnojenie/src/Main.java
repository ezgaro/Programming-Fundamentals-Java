import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int last = Integer.parseInt(sc.nextLine());
        int sum = Integer.parseInt(sc.nextLine());
        int combinations = 0;
        boolean flag = false;

        for(int i = first ; i <=last ; i++) {
            for(int j = first ; j <=last ; j++) {
                combinations++;
                if(i + j == sum) {
                    flag = true;
                    System.out.println("Combination No" + combinations);
                    System.out.printf("(%d + %d) = %d" , i , j , sum);
                    break;
                }
            }
            if(flag) {
                break;
            }
        }
        if(!flag) {
            System.out.println(combinations + " combinations -");
            System.out.println("neither equals " + sum);
        }
    }
}