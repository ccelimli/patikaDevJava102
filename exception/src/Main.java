import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Başladı!");
        Scanner input = new Scanner(System.in);
//       System.out.println("A sayısını gir: ");
//        int a=1;
//        int b=10;
//        int c;
//        int[] array=new int[2];
//        try {
//            System.out.println("Bölme İşlemi");
//            System.out.println(b/a);
//            System.out.println("Bölme işlemi bitti");
//            c=input.nextInt();
//            array[10]=11;
//        }catch (ArithmeticException e){
//            System.out.println("Aritmetik Hata oluştu");
//            System.out.println(e.getMessage());
//        }
//        catch (InputMismatchException e){
//            System.out.println("Yanlış veri girildi");
//            System.out.println(e.getMessage());
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Dizi Sınırı Aşıldı!");
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("Program Bitti");
        System.out.println("Yaş Gir: ");
        int age=input.nextInt();
        try {
            checkAge(age);
        }catch (Exception error){
            System.out.println(error.toString());
        }
    }

    public static void checkAge(int age) throws AgeCheckOutException {
        if (age < 18) {
            throw new AgeCheckOutException("Hata Yakalandı!");
        }

        System.out.println("Yaş Uygun");
    }
}