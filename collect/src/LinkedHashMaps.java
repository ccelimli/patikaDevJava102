import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMaps
{
    public static void main(String[] args) {
        TreeMap<Integer,Student> hashMap= new TreeMap<>(new OrderByNoComparator());

        hashMap.put(105,new Student("5. Öğrenci",56));
        hashMap.put(101,new Student("2. Öğrenci",89));
        hashMap.put(108,new Student("1. Öğrenci",45));
        hashMap.put(104,new Student("4. Öğrenci",64));
        hashMap.put(103,new Student("3. Öğrenci",23));

        for (Student student: hashMap.values()){
            System.out.println(student.getName());
        }
    }
}
