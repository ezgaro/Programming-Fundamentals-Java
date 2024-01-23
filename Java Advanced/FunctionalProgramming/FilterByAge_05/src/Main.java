import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static class Person{
        String name;
        int age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        while(n-- >0) {
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person();
            person.name = name;
            person.age = age;
            people.add(person);
        }
        String youngerOrOlder = scanner.nextLine();
        int ageCompare = Integer.parseInt(scanner.nextLine());
        String outputParameters = scanner.nextLine();

        Predicate<Person> yearsOperations = compareAges(youngerOrOlder , ageCompare);
        Consumer<Person> outputNameAge = outptuStrings(outputParameters);

        people.stream()
                .filter(yearsOperations)
                .forEach(outputNameAge);

    }

    private static Consumer<Person> outptuStrings(String outputParameters) {
        if(outputParameters.equals("name")) {
            return ss -> System.out.println(ss.name);
        } else if (outputParameters.equals("age")) {
            return ss -> System.out.println(ss.age);
        }

        return ss -> System.out.println(ss.name + " - " + ss.age);
    }

    private static Predicate<Person> compareAges(String youngerOrOlder, int ageCompare) {
        if(youngerOrOlder.equals("older")) {
            return person -> person.age >= ageCompare;
        }
        return person -> person.age <= ageCompare;
    }
}