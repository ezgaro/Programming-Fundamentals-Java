import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        String path1 ="04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/text.txt";
        String path2 = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt";
        String path3 = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt";
        String output = "04-Java-Advanced-Streams-Files-and-Directories-Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/files.zip";

        List<String> paths = List.of(path1 , path2 , path3);


        try(FileOutputStream fileOutputStream = new FileOutputStream(output);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream)) {

            for (String path : paths) {
                File fileToZip = new File(path);
                FileInputStream fileInputStream = new FileInputStream(fileToZip);
                ZipEntry zipEntry = new ZipEntry(fileToZip.getName());


                zipOutputStream.putNextEntry(zipEntry);

                int read = fileInputStream.read();
                while(read != -1) {
                    zipOutputStream.write(read);
                    read = fileInputStream.read();
                }
                fileInputStream.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}