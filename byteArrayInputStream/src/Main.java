import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        byte[] array= {1,2,3,54,66};
//        ByteArrayInputStream byteArrayInputStream= new ByteArrayInputStream(array);
//       // ByteArrayInputStream byteArrayInputStream2= new ByteArrayInputStream(array,0,4);
//        System.out.println(byteArrayInputStream.read());
//        System.out.println(byteArrayInputStream.read());
//        System.out.println(byteArrayInputStream.read());
//        System.out.println("Kullanılabilen byte sayısı: "+byteArrayInputStream.available());
//        try {
//            byteArrayInputStream.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        String message="Bu bir deneme mesajıdır.";
        ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream();
        byte[] array=message.getBytes();

        try {
            byteArrayOutputStream.write(array);
            String newData= byteArrayOutputStream.toString();
            System.out.println(newData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}