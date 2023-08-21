import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TreeSet<Student> students=new TreeSet<>(new OrderNoteCompator().reversed());
        TreeSet<Student> students=new TreeSet<>(new OrderNameCompator());
        students.add(new Student("2. Öğrenci",100));
        students.add(new Student("3. Öğrenci",55));
        students.add(new Student("4. Öğrenci",69));
        students.add(new Student("5. Öğrenci",75));
        students.add(new Student("1. Öğrenci",88));

//        Iterator<Student> iterator=students.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next().getName()+":"+iterator.next().getNote());
//        }

        for (Student item: students){
            System.out.println(item.getName()+":"+item.getNote());
        }
    }
}