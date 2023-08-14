public class Main {
    public static void main(String[] args) {
        MyList<Integer> mylist = new MyList<>();

        System.out.println("Dizi kapasitesi : " + mylist.getCapacity());
        mylist.add(12);
        mylist.add(10);
        mylist.add(13);
        mylist.add(22);
        System.out.println("Eleman sayisi : " + mylist.size());
        System.out.println(mylist.toString());


    }
}