import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        Deque<Integer> males = parseInputAsStack(sc.nextLine());
        Deque<Integer> females = parseInputAsQueue(sc.nextLine());

        int matches = 0;
        while (!males.isEmpty() && !females.isEmpty()) {
            var female = getPerson(females);
            if(female == null) {
                break;
            }
            var male = getPerson(males);
            if(male == null) {
                females.addFirst(female);
                break;
            }

            if(female.equals(male)) {
                matches++;
            } else {
                males.addFirst(male - 2);
            }
        }
        System.out.println(prettifyOutput(matches, males, females));
    }

    private static String prettifyOutput(int matches, Deque<Integer> males, Deque<Integer> females) {
        var stringifiedMales = males.toString();
        var stringifiedFemales = females.toString();
        return "Matches: " + matches +
                "\nMales left: " + (males.isEmpty() ? "none": stringifiedMales.substring(1,stringifiedMales.length() - 1)) +
                "\nFemales left: " + (females.isEmpty() ? "none": stringifiedFemales.substring(1,stringifiedFemales.length() - 1));

    }

    private static Integer getPerson(Deque<Integer> people) {
        while (!people.isEmpty()) {
            var person = people.pollFirst();
            if(person <= 0) {
                continue;
            }
            if(person % 25 == 0) {
                people.pollFirst();
                continue;
            }
            return person;
        }
        return null;
    }

    private static Deque<Integer> parseInputAsQueue(String line) {
        return Arrays.stream(line.split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toCollection(ArrayDeque::new));
    }

    private static Deque<Integer> parseInputAsStack(String line) {
        var stack = new ArrayDeque<Integer>();
        for(String input : line.split(" ")) {
            stack.addFirst(Integer.valueOf(input));
        }
        return stack;
    }
}