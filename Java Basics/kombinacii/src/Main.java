import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = Integer.parseInt(sc.nextLine());
        int combinations = 0;
        boolean flag = false;

        for(int i = 0 ; i <=sum ; i++) {
            for(int j = 0 ; j <=sum ; j++) {
                for(int k = 0 ; k <= sum ; k++){
                    if((i + j + k) == sum) {
                        combinations++;
                    }
               }
           }
       }
        System.out.println(combinations);
   }
}