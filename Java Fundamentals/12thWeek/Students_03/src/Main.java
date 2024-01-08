import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();
        for(int i = 1 ;  i <= n ; i++) {
            String currentInput = scanner.nextLine();
            String firstName = currentInput.split(" ")[0];
            String lastName = currentInput.split(" ")[1];
            double grade = Double.parseDouble(currentInput.split(" ")[2]);
            Student student = new Student(firstName , lastName , grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for(Student student : studentList) {
            System.out.printf("%s %s: %.02f%n" , student.getFirstName() , student.getLastName() , student.getGrade());
        }

    }
}