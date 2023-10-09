package CollectionFrameworkMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap();
        map.put(1,"Gaurav");
        map.put(2,"Sharma");
        map.put(3,"Amar");
        map.put(4,"Bhai");
        map.put(4,"Sharma");
        System.out.println(map.containsKey(33));
      //  map.clear();
        System.out.println(map.containsValue("Gsharma"));
        System.out.println(map);
        System.out.println(map.get(2));
        Map<Integer,String> map1=new HashMap<>();
        map1.putAll(map);
        map.replace(1,"maddona");
        map.remove(2);
        System.out.println("map1"+map1);
       Set<Map.Entry<Integer,String>> set=map.entrySet();
        System.out.println(set);
    }
}
