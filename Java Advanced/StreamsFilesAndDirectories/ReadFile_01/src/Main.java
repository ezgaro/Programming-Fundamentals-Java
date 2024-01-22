import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "04-Java-Advanced-Streams-Files-and-Directories-" +
                "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        try(FileInputStream inputStream = new FileInputStream(path)) {
            int oneByte = inputStream.read();
            while ((oneByte >= 0)) {
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = inputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}