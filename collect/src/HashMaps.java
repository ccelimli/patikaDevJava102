import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();

        map.put("01","Adana");
        map.put("34","İstanbul");
        map.put("06","Ankara");
        map.put("35","İzmir");
        map.put("07","Antalya");

        System.out.println(map.get("07"));

        for (String item: map.keySet()){
            System.out.println(item);
        }
        System.out.println("---------------------------------------");
        for (String item : map.values()){
            System.out.println(item);
        }
        System.out.println("---------------------------------------");
        for (String item: map.keySet()){
            System.out.println(map.get(item));
        }
    }
}
