package CollectionFrameworkMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMethodsDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Cricket");
        map.put(2, "Football");
        map.put(3, "Dandiya");
        map.put(4, "GOlf");
        // System.out.println(map);

        //retrieving elements of Hashmap using set and Iterator interface
        Set set = map.entrySet();
        //  System.out.println(set);
        Iterator itr = set.iterator();
        //while (itr.hasNext()){
        //one thing to keep in mind is this ,that itr.next() returns
        //the entry (which is pair of key and value)
        //but if we have to retrieve only key or value ,then we will use
        //methods of entry interface such as getValue() or getKey()
        //  System.out.println(itr.next());
        //   Map.Entry entry=(Map.Entry)itr.next();
        //  System.out.println(entry.getKey()+"->"+entry.getValue());

    //}
            //new method for retrieving elements from Map using forEach
            for(Map.Entry entry1: map.entrySet()){
                System.out.println(entry1.getKey()+"->"+entry1.getValue());
            }
        }
    }

