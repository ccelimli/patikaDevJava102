import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream= new FileInputStream("inputStreamReader/src/patika.txt");
            InputStreamReader inputStreamReader= new InputStreamReader(fileInputStream);
            //InputStreamReader inputStreamReader2= new InputStreamReader(fileInputStream, Charset.forName("Big5"));
            System.out.println(inputStreamReader.getEncoding());
            int i= inputStreamReader.read();
            while (i!=-1){
                System.out.print((char)i);
                i=inputStreamReader.read();
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}