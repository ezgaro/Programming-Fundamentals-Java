import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> stringList = new ArrayList<>();

        for(int i = 0 ;  i < n ; i++) {
            stringList.add(scanner.nextLine());
        }
        Collections.sort(stringList);

        for(int j = 0 ; j < stringList.size() ; j++) {
            System.out.printf("%d.%s" ,(j + 1) , stringList.get(j));
            System.out.println();
        }

    }
}