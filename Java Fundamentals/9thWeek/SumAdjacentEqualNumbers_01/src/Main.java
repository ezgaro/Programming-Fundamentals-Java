import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        for (int i = 0 ; i <numberList.size() - 1; i++) {
            double currentNum = numberList.get(i);
            double nextNum = numberList.get(i+1);
            double sum = currentNum + nextNum;
            if(currentNum == nextNum) {
                numberList.set(i , sum);
                numberList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(numberList , " "));
    }


    public static String joinElementsByDelimiter(List<Double> list, String delimeter) {
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for(double item : list) {
            String numDf = df.format(item) + delimeter;
            result +=numDf;
        }
        return result;
    }
}


