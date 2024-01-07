import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if(input.contains("Add")) {
                int currentInput = Integer.parseInt(input.split(" ")[1]);
                numbers.add(currentInput);
            } else {
                for(int i = 0 ; i < numbers.size() ; i++) {
                    int currentInput = Integer.parseInt(input);
                    int currentWagon = numbers.get(i);
                    if(currentWagon + currentInput <= maxCapacity) {
                        currentWagon += currentInput;
                        numbers.set(i , currentWagon);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        for(int i = 0 ; i < numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}