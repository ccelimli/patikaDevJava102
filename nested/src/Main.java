public class Main {
    public static void main(String[] args) {
        Out out = new Out();
//        out.run();
//        System.out.println("------------------------------------------");
//        Out.In in = out.new In();
//        in.run();

//        Out.In in= out.getIn();
//        in.run();

//        Out.Inner.run();
//
//        Local local= new Local();
//        local.run();

        Anonim anonim= new Anonim(){
            public int a=20;
            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Run metodunun içeriği değiştirildi.");
                print();
            }

            public void print(){
                System.out.println("İşlem Tamamlandı!");
            }
        };
        anonim.run();
    }
}