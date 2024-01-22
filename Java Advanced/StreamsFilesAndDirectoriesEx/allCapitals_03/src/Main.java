import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        String inputPath = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String outputPath = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/output.txt";

        try(BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
            BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))) {
            String line = reader.readLine();
            while (line != null) {
                writer.write(line.toUpperCase());
                line = reader.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}