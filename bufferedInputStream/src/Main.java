import java.io.*;

public class Main {
    public static void main(String[] args) {
        String data="Java Patikası";
        try {
//            FileInputStream fileInputStream= new FileInputStream("bufferedInputStream/src/patika.txt");
//            BufferedInputStream bufferedInputStream= new BufferedInputStream(fileInputStream);
//            int i=bufferedInputStream.read();
//            while(i!=-1){
//                System.out.println((char)i);
//                i=bufferedInputStream.read();
//            }

            FileOutputStream fileOutputStream= new FileOutputStream("bufferedInputStream/src/patika.txt");
            BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(fileOutputStream);
            byte[] byteArray= data.getBytes();
            bufferedOutputStream.write(byteArray);
            bufferedOutputStream.close();
            fileOutputStream.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}