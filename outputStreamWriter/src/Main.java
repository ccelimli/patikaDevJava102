import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        String data= "ĞİÖŞÇ";
        try {
            FileOutputStream fileOutputStream= new FileOutputStream("outputStreamWriter/src/output.txt");
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
            //OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream, Charset.forName("Big5"));
            //fileOutputStream.write(data.getBytes(Charset.forName("Big5")));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}