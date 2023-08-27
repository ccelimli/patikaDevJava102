import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File dosya= new File("fileClass/src/a.txt");
//        File dizin=new File("fileClass/src/test2");
//        dizin.mkdir();
//        try{
//            if (dosya.createNewFile()){
//                System.out.println(dosya.getName()+ " dosyası oluşturuldu.");
//            }
//            else {
//                System.out.println("Dosya zaten var!");
//            }
//        }catch (Exception error){
//            System.out.println(error.getMessage());
//        }
//        dosya.delete();

        File dizin = new File("fileClass/src/test");
        String[] arr=dizin.list();

        for (String item:arr){
            System.out.println(item);
        }

    }
}