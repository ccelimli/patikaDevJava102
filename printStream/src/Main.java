import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            PrintStream output= new PrintStream("printStream/src/print.txt");
            output.print(1234123);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}