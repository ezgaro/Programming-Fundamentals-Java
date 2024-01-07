import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Student{
        String firstName;
        String lastName;
        int age;
        String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> studentsList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] currentInput = input.split(" ");
            String firstName = currentInput[0];
            String lastName = currentInput[1];
            int age = Integer.parseInt(currentInput[2]);
            String town  = currentInput[3];

            Student currentStudent = new Student(firstName , lastName , age ,town);
            studentsList.add(currentStudent);
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for(Student student : studentsList) {
            if(student.homeTown.equals(city)){
                System.out.printf("%s %s is %d years old", student.firstName , student.lastName , student.age);
                System.out.println();
            }
        }
    }
}