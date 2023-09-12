public class Main {
    public static void main(String[] args) {
//        new Runnable(){
//            @Override
//            public void run(){
//                System.out.println("Runnable Sınıfı");
//            }
//        }.run();

//        Runnable r1 = () -> System.out.println("R1 sınıfı");
//
//        Runnable r2 = () -> {
//            System.out.println("R2 sınıfı");
//        };
//
//        r1.run();
//        r2.run();

        Math toplama=(a,b)->a+b;
        Math carpma=(a,b)->a*b;
        Math cikart=(a,b)->a-b;
        Math bol=(a,b)-> {
            if (b==0){
                System.out.println("Hata");
            }
           return  a / b;
        };

        System.out.println(toplama.transaction(18,20));
        System.out.println(bol.transaction(18,0));
    }
}