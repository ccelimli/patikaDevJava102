import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        File file = new File("fileOutputStream/src/patika.txt");
        String message = "Bu Bir Örnek Mesajdır.\nPatika.Dev";

        try {
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream("fileOutputStream/src/patika.txt", true);
            byte[] arr = message.getBytes();
            fileOutputStream.write(arr);
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}