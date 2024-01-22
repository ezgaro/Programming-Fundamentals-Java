import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputPath = "/home/stefan/Documents/java/SoftUni/Java Advanced/StreamsFilesAndDirectoriesEx/CopyaPicture_07/randomImage.png";
        String outputPath = "/home/stefan/Documents/java/SoftUni/Java Advanced/StreamsFilesAndDirectoriesEx/CopyaPicture_07/picture-copy.png";

        try (FileInputStream fileInputStream = new FileInputStream(inputPath);
             FileOutputStream fileOutputStream = new FileOutputStream(outputPath)){

            int oneByte= fileInputStream.read();
            while (oneByte != -1) {
                fileOutputStream.write(oneByte);
                oneByte = fileInputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}