import java.util.Scanner;

public class Store {
    public static Scanner input= new Scanner(System.in);

    public static void start(){
        while(true){
            System.out.println("################# Patika Store #################\n\n");
            System.out.println("1- Notebook İşlemleri ");
            System.out.println("2- Cep Telefonu İşLemleri ");
            System.out.println("3- Marka Lislete ");
            System.out.println("4- Çıkış Yap\n\n ");
            System.out.println("Seçim: ");
            Integer select = input.nextInt();

            switch (select){
                case 1->new Computer().process();
                case 2->new SmartPhone();
                case 3->new Brand().location();
                case 4->{
                    System.out.println("\n\nGoodBye!");
                    System.exit(0);
                }
            }
        }



    }
}
