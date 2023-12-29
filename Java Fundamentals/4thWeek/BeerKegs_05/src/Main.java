import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        String theBiggestKeg = "";
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1 ; i <= n ; i++) {
            String model = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());
            double keg = Math.PI * r*r*h;
            if(keg > max) {
                max = keg;
                theBiggestKeg = model;
            }
        }

        System.out.println(theBiggestKeg);
    }
}