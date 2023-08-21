import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

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

        LinkedHashSet<Integer> integerLinkedHashSet=new LinkedHashSet<>();
        integerLinkedHashSet.add(1);
        integerLinkedHashSet.add(2);
        integerLinkedHashSet.add(3);
        integerLinkedHashSet.add(4);

        Iterator<Integer> integerIterator1= integerLinkedHashSet.iterator();
        while (integerIterator1.hasNext()){
            System.out.println(integerIterator1.next());
        }


    }
}