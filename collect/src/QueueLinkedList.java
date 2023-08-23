import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();
        queue.add("Adana");
        queue.add("İstanbul");
        queue.add("Ankara");
        queue.add("İzmir");
        queue.offer("Eskişehir");

        Iterator<String> iterator=queue.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
