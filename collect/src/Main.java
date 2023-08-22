import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TreeSet<Student> students=new TreeSet<>(new OrderNoteCompator().reversed());
//        TreeSet<Student> students=new TreeSet<>(new OrderNameCompator());
//        students.add(new Student("2. Öğrenci",100));
//        students.add(new Student("3. Öğrenci",55));
//        students.add(new Student("4. Öğrenci",69));
//        students.add(new Student("5. Öğrenci",75));
//        students.add(new Student("1. Öğrenci",88));

//        Iterator<Student> iterator=students.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next().getName()+":"+iterator.next().getNote());
//        }
//
//        for (Student item: students){
//            System.out.println(item.getName()+":"+item.getNote());
//        }
        List<Integer> liste= new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(30);
        liste.add(30);
        liste.add(30);
        liste.add(40);
        liste.add(null);
        liste.add(3,25);
        System.out.println(liste);

        Iterator<Integer> iterator=liste.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(liste.size());
        System.out.println(liste.get(2));

        System.out.println(liste.indexOf(30));
        System.out.println(liste.lastIndexOf(30));
        System.out.println(liste.remove(0));
   }
}