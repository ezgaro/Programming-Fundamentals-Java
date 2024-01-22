import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt");
        List<String> lines = Files.readAllLines(path)
                .stream()
                .sorted()
                .toList();

        Path outputPath = Paths.get("read-sort-lines.txt");
        Files.write(outputPath ,lines);

    }
}