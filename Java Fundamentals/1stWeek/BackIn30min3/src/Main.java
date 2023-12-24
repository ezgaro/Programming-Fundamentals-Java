import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initHour = Integer.parseInt(scanner.nextLine());
        int initMinutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (initHour * 60) + initMinutes + 30;

        int hour = allMinutes / 60;
        int minutes = allMinutes % 60;

        if(hour > 23) {
            hour = 0;
        }

        System.out.println(hour + ":" + minutes);
    }
}