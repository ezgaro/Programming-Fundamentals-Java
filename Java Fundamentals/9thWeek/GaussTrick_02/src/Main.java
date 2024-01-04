import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
        int k = 1;
        for (int i = 0; i < numberList.size() / 2; i++) {
            int firstNum = numberList.get(i);
            int lastNum = numberList.get(numberList.size() - k);
            System.out.print(firstNum + lastNum + " ");
            k++;
        }
        if(numberList.size() % 2 != 0) {
            int l = numberList.size() / 2;
            System.out.println(numberList.get(l));
        }
    }
}