public class Main {
    public static void main(String[] args) {
        int a = 10;

        //Autoboxing
        Integer b = a;

        //Boxing
        Integer c = Integer.valueOf(a);

        //Autoboxing
        int d=c;

        //Unboxing
        int i=c.intValue();
    }
}