import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String inputPath = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String outputPath = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/output.txt";


        Set<Character> vowels = Set.of('a' , 'e' , 'i' ,'o' , 'u');
        Set<Character> punctuations = Set.of('!' , ',' , '.' ,'?');
        int vowelsCount = 0;
        int punctuationCount = 0;
        int othersCount = 0;

        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath));){

            String line = reader.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);
                    if(vowels.contains(symbol)) {
                        vowelsCount++;
                    } else if (punctuations.contains(symbol)) {
                        punctuationCount++;
                    } else if (symbol != ' ') {
                        othersCount++;
                    }
                }
                line = reader.readLine();
            }

            writer.write(String.format("Vowels: %d%n" , vowelsCount));
            writer.write(String.format("Other Symbols: %d%n" , othersCount));
            writer.write(String.format("Punctuation: %d%n" , punctuationCount));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}