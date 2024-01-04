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
                case "Contains" :
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    if(numberList.contains(numToAdd)) System.out.println("Yes");
                    else System.out.println("No such number");
                    break;
                case "Print" :
                    String type = commandArr[1];
                    if(type.equals("even")){
                        for(int list : numberList) {
                            if(list % 2 == 0) {
                                System.out.print(list + " ");
                            }
                        }
                        System.out.println();
                    } else if(type.equals("odd")) {
                        for(int list : numberList) {
                            if(list % 2 != 0) {
                                System.out.print(list + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get" :
                    int sum = 0;
                    for(int list : numberList) {
                        sum+=list;
                    }
                    System.out.println(sum);
                    break;
                case "Filter" :
                    String condition = commandArr[1];
                    int number = Integer.parseInt(commandArr[2]);
                    for(int list : numberList) {
                        switch (condition) {
                            case "<":
                                if (list < number) {
                                    System.out.print(list + " ");
                                }
                                break;
                            case ">":
                                if (list > number) {
                                    System.out.print(list + " ");
                                }
                                break;
                            case "<=":
                                if (list <= number) {
                                    System.out.print(list + " ");
                                }
                                break;
                            case ">=":
                                if (list >= number) {
                                    System.out.print(list + " ");
                                }
                                break;
                        }
                    }
                    System.out.println();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}