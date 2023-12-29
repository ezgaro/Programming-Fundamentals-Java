import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (!(input = scanner.nextLine()).equals("END")) {
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                System.out.println(input + " is boolean type");
            } else if (input.length() == 1) {
                System.out.println(input + " is character type");
            } else {
                try {
                    Integer.parseInt(input);
                    System.out.println(input + " is integer type");
                } catch (NumberFormatException e1) {
                    try {
                        Double.parseDouble(input);
                        System.out.println(input + " is floating point type");
                    } catch (NumberFormatException e2) {
                        System.out.println(input + " is string type");
                    }
                }
            }
        }
    }
}