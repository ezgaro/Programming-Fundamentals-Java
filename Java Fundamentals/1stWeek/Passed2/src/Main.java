import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if(grade >= 3) {
            System.out.println("Student has passed the exam");
        }
    }
}