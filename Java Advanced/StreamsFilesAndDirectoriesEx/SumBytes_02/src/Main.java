import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        String path = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        long sum = 0;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(path))){
            String line = bufferedReader.readLine();
            while (line != null) {
                for (char c : line.toCharArray()) {
                    sum+=c;
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}