package com.accenture.democode.day7.collections;

import java.util.HashMap;
import java.util.Map;

/*
Map
- key-value pair
{
    key: value
}
 */
public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();

        // put value
        map1.put("key1", 1234);
        map1.put("key2", 456);
        map1.put("key3", 12312);

        // modify map elements
        map1.put("key3", 0);

        // get value
        System.out.println("key2: " + map1.get("key"));

        // traversing maps
        for(String key : map1.keySet()) {
            System.out.println(map1.get(key));
        }
    }
}
