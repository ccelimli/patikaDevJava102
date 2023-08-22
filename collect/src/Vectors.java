import java.util.Iterator;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> vector= new Vector<>();
        vector.add("Adana");
        vector.add("İstanbul");
        vector.add("İzmir");
        vector.add("Ankara");

        vector.add(2,"Antalya");

        Iterator iterator= vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
