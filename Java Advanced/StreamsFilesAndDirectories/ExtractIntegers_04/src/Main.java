import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        Scanner scanner = new Scanner(new FileInputStream(path));
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("04.ExtractIntegersOutput.txt"));
        while (scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                printWriter.println(scanner.next());
            }
            scanner.next();
        }

        printWriter.close();
    }
}