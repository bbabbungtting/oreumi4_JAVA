package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);
        //hashMap.put("key2",2);
        System.out.println(hashMap);

        boolean isContains = hashMap.containsKey("None키");
        boolean containValus = hashMap.containsValue(3);

        System.out.println(isContains);
        System.out.println(containValus);

        Set<String> keySet = hashMap.keySet();
        System.out.println(keySet);

        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = hashMap.get(key);
            System.out.println(key + ":" + value);
        }

        Set<Map.Entry<String,Integer>>entrySet = hashMap.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(entry);
            System.out.println(key + ":" + value);
        }
    }
}
