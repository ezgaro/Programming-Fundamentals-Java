import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources";
        File directory = new File(path);
        File[] files = directory.listFiles();
        int sum= 0;
        for (File file : files) {
            sum += file.length();
        }
        System.out.println(sum);
    }
}