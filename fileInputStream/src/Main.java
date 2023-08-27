import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
//            File file = new File("fileInputStream/src/patika.txt");
//            FileInputStream fileInputStream2= new FileInputStream(file);
            FileInputStream fileInputStream= new FileInputStream("fileInputStream/src/patika.txt");
//            int i= fileInputStream.read();
//            while(i!=-1){
//                System.out.println((char) i);
//                i=fileInputStream.read();
//            }
            System.out.println("Kullanılabilir byte sayısı: "+fileInputStream.available());
            fileInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}