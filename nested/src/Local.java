public class Local {
    //Local Sınıflar
    public void run(){
        System.out.println("Local Sınıfı Çalıştı!");
        class Yerel{
            private int a;

            public Yerel(int a){
                this.a=a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        Yerel yerel= new Yerel(15);
        System.out.println(yerel.getA());
    }
}
