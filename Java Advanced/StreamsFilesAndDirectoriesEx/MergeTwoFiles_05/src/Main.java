import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String inputPath1 = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input1.txt";
        String inputPath2 = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input2.txt";
        String outputPath = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/output.txt";


        try (BufferedReader reader1 = Files.newBufferedReader(Path.of(inputPath1));
             BufferedReader reader2 = Files.newBufferedReader(Path.of(inputPath2));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath));){

            String line = reader1.readLine();
            while(line != null) {
                writer.write(line);
                writer.newLine();
                line = reader1.readLine();
            }

            line = reader2.readLine();
            while(line != null) {
                writer.write(line);
                writer.newLine();
                line = reader2.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}