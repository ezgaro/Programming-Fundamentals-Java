import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while(!input.equals("End")) {
            String[] currInput = input.split(" ");
            String name = currInput[0];
            String id = currInput[1];
            int age = Integer.parseInt(currInput[2]);
            Person person = new Person(name , id , age);
            personList.add(person);
            input = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));
        for(Person person : personList) {
            System.out.println(person.toString());
        }
    }
}