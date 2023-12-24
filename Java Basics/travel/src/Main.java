import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while(!input.equals("End")) {
            String destination = input;
            double budget = Double.parseDouble(sc.nextLine());

            double sum = 0;
            while(sum < budget) {
                double amount = Double.parseDouble(sc.nextLine());
                sum+=amount;
            }
            System.out.printf("Going to %s!%n" , destination);
            input = sc.nextLine();
        }
    }
}