import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .toList();


        if(numberList.size() < 3) {
            for (Integer num : numberList) {
                System.out.print(num + " ");
            }
        } else {
            for (int i = 0 ; i < 3 ; i++ ) {
                System.out.print(numberList.get(i) + " ");
            }
        }
    }
}