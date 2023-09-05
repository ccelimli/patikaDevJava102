import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
//            FileReader fileReader= new FileReader("fileReader/src/output.txt");
//            int i=fileReader.read();
//            while (i!=-1){
//                System.out.print((char)i);
//                i= fileReader.read();
//            }
            String data = "JAVA";
            FileWriter fileWriter= new FileWriter("fileReader/src/output.txt");
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}