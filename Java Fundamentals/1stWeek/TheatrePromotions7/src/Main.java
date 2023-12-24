import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfTheWeek = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        boolean isValid = true;

        if(age >= 0 && age <= 18){
            if(dayOfTheWeek.equals("Weekday")) {
                price = 12;
            } else if (dayOfTheWeek.equals("Weekend")) {
                price = 15;
            } else if (dayOfTheWeek.equals("Holiday")) {
                price = 5;
            } else {
                isValid = false;
            }
        } else if (age > 18 && age <=64) {
            if(dayOfTheWeek.equals("Weekday")) {
                price = 18;
            } else if (dayOfTheWeek.equals("Weekend")) {
                price = 20;
            } else if (dayOfTheWeek.equals("Holiday")) {
                price = 12;
            } else {
                isValid = false;
            }
        } else if(age > 64 && age <= 122){
            if(dayOfTheWeek.equals("Weekday")) {
                price = 11;
            } else if (dayOfTheWeek.equals("Weekend")) {
                price = 15;
            } else if (dayOfTheWeek.equals("Holiday")) {
                price = 10;
            } else {
                isValid = false;
            }
        } else {
            isValid = false;
        }

        if(!isValid) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$" , price);
        }
    }
}