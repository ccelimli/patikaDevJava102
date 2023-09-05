import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String data="Java 102";
        try {
            PrintWriter printWriter= new PrintWriter("printWriter/src/input.txt");
            printWriter.print(data);
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}