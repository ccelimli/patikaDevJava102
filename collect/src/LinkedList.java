import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> list= new java.util.LinkedList<>();
        list.add("1. Öğrenci");
        list.add("2. Öğrenci");
        list.add("3. Öğrenci");
        list.add("4. Öğrenci");

        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
