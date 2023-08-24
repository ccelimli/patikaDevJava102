import java.util.*;
import java.util.LinkedList;

public class PriorityQueues {
    public static void main(String[] args) {

        PriorityQueue<String> queue= new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        queue.add("Kalem");
        queue.add("Silgi");
        queue.add("Araba");
        queue.add("Bardak");

        for (String item : queue){
            System.out.println(item);
        }


    }
}
