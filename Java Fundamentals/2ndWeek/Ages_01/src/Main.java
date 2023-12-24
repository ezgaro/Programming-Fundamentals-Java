import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = Integer.parseInt(scanner.nextLine());
        if(age >= 0 && age <= 2) {
            System.out.println("Baby");
        } else if (age >= 3 && age <= 13) {
            System.out.println("Child");
        } else if (age >= 14 && age <= 19) {
            System.out.println("Teenager");
        } else if (age  >= 20 && age  <= 65) {
            System.out.println("Adult");
        } else {
            System.out.println("Elder");
        }
    }
}