import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] codes = input.split("\\s+");

        double totalSum = 0;
        for(String code : codes) {
            double modifiedNumber = getModifiedNumber(code);
            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f" , totalSum);
    }

    private static double getModifiedNumber(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter ,' ').replace(secondLetter , ' ').trim());
        if(Character.isUpperCase(firstLetter)) {
            int positionFirstLetter = (int)firstLetter - 64;
            number/=positionFirstLetter;
        } else {
            int positionFirstLetter = (int)firstLetter - 96;
            number*=positionFirstLetter;
        }


        if(Character.isUpperCase(secondLetter)) {
            int positionSecondNumber = (int)secondLetter - 64;
            number-=positionSecondNumber;
        } else {
            int positionSecondNumber = (int)secondLetter - 96;
            number+=positionSecondNumber;
        }

        return number;
    }
}