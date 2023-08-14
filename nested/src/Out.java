public class Out {
    public int a = 5;
    public static int b = 20;

    public class In {
        public int a = 10;

        public void run() {
            System.out.println("In sınıfa ait Run fonksiyonu çalıştı.");
            int a = 1;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.b);
        }
    }

    public void run() {
        In in = new In();
        in.run();
    }

    public In getIn() {
        In in = new In();
        return in;
    }

    public static class Inner {
        public static int a = 55;

        public static void run() {
            System.out.println("Inner sınıfa ait Run fonksiyonu çalıştı.");
            int a = 1;
            System.out.println(a);
            System.out.println(Inner.a);
            System.out.println(Out.b);
        }
    }

    public void runInner() {
        Inner.run();
    }
}
