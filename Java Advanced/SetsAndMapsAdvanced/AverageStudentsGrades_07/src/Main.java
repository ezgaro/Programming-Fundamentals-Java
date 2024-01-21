import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String , ArrayList<Double>> studentGrades = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String currentName = input[0];
            double currentGrade = Double.parseDouble(input[1]);
            if(!studentGrades.containsKey(currentName)) {
                studentGrades.put(currentName , new ArrayList<>());
            }
            studentGrades.get(currentName).add(currentGrade);
        }

        studentGrades.forEach((k,v) -> {
            double avg = v.stream().mapToDouble(e -> e).average().getAsDouble();
            System.out.printf("%s -> ", k);
            for (double grade : v) {
                System.out.printf("%.2f ", grade);
            }
            System.out.printf("(avg: %.2f)%n", avg);
        });
    }
}