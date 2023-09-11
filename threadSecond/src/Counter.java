public class Counter implements Runnable{
    public String name;

    public Counter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.getName()+ " sayacı başladı!");
        int i=0;
        while (i<100){
            System.out.println(this.getName()+": "+i);
            i++;
        }
    }
}
