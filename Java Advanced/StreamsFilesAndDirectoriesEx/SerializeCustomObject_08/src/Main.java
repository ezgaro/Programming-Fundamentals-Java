import java.io.*;

public class Main {
    static class Course implements Serializable{
        private String name;
        private int students;

        public Course(String name, int students) {
            this.name = name;
            this.students = students;
        }
    }

    public static void main(String[] args) {
        Course course = new Course("Java Advance" ,250);

        String path ="/home/stefan/Documents/java/SoftUni/Java Advanced/StreamsFilesAndDirectoriesEx/SerializeCustomObject_08/04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/course.ser";
        try (
             FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

             FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            //serialization
          objectOutputStream.writeObject(course);
          //deserialization
            Course deserializedObjectCourse = (Course) objectInputStream.readObject();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}