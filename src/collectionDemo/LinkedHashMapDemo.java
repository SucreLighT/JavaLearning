package collectionDemo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sucre
 * @date 2019-08-12
 * @time 09:37
 * @description LinkedHashMap
 */

/*
    LinkedHashMap
    LinkedHashMap是存和取的顺序是一样
    LinkedHashMap它是继承HashMap
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<Integer, String>();
        map.put(1,"a1");
        map.put(2,"b");
        map.put(3,"c");
        map.put(1,"a2");

        System.out.println(map);
    }
}
