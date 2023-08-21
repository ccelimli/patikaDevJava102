import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet= new HashSet<>();
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(null);

        for (Integer item: hashSet){
            System.out.println(item);
        }
        hashSet.clear();

        Iterator<Integer> integerIterator= hashSet.iterator();

    }
}