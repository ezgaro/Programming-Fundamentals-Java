import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for ( String elementSecondArray : secondArr) {
            for (String elementFirstArray : firstArr) {
                if(elementSecondArray.equals(elementFirstArray)) {
                    System.out.print(elementSecondArray + " ");
                    break;
                }
            }
        }
    }
}