import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballValue = 0;
        int snowballQuality = 0;

        for(int i = 0 ; i < n ; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            int k = snow / time;

            int value = (int)Math.pow( k , quality);
            if(value > max) {
                max = value;
                snowballSnow = snow;
                snowballTime = time;
                snowballValue = value;
                snowballQuality = quality;
            }
        }
        System.out.printf("%d : %d = %d (%d)" , snowballSnow , snowballTime , snowballValue , snowballQuality);
    }
}