public class Main {
    public static void main(String[] args) {
//        double pi=3.14;
//        int sayi=(int)pi;
//        byte a=80;
//        System.out.println((char)a);

        int a=20;
        System.out.println("Integer: "+a);

        String str=String.valueOf(a);
        System.out.println(str);

        int b=Integer.parseInt(str);
        System.out.println(b+a);
    }
}