import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secNum = Integer.parseInt(scanner.nextLine());
        deistvie(text , firstNum , secNum);
    }
    public static void deistvie(String text , int number1 , int number2) {
        if(text.equals("add")) {
            System.out.println(number1 + number2);
        } else if(text.equals("multiply")) {
            System.out.println(number1*number2);
        } else if (text.equals("subtract")) {
            System.out.println(number1 - number2);
        } else if (text.equals("divide")) {
            System.out.println(number1 / number2);
        }
    }
}