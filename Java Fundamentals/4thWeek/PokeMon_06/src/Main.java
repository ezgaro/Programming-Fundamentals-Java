import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int countPoke = 0;
        int firstPower = power;

        while(power >=  distance) {
            power-=distance;
            countPoke++;
            if(power == firstPower / 2 && factor != 0) {
                power = power/factor;
                break;
            }
        }
        System.out.println(power);
        System.out.println(countPoke);
    }
}