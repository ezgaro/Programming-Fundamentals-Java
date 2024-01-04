import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while(!input.equals("end")) {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            switch (command){
                case "Add" :
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    numberList.add(numToAdd);
                    break;
                case "Remove" :
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    numberList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt" :
                    int indexRemove = Integer.parseInt(commandArr[1]);
                    numberList.remove(indexRemove);
                    break;
                case "Insert" :
                    int numberToRemove = Integer.parseInt(commandArr[1]);
                    int indexOfInsert = Integer.parseInt(commandArr[2]);
                    numberList.add(indexOfInsert,numberToRemove);
            }
            input = scanner.nextLine();
        }
        for(int item : numberList) {
            System.out.print(item + " ");
        }

//        System.out.println(numberList.toString().replaceAll("[\\[\\],]",""));
    }
}