import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];

        for(int i = n - 1 ; i >= 0 ; i--) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));


//        String values = scanner.nextLine();
//        String[] valuesArray = values.split(" ");
//        int[] intArray = new int[valuesArray.length];
//        for(int i = 0 ; i < valuesArray.length ; i++) {
//            intArray[i] = Integer.parseInt(valuesArray[i]);
//        }
//        System.out.println(intArray);
    }
}