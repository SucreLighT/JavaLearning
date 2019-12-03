package Java22_junitTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * @author sucre
 * @date 2019-12-02
 * @time 10:18
 * @description
 */
public class HashMapDemo {
    public static HashMap<String, String> hm = new HashMap<String, String>();

    public void initialize() {
        hm.put("name", "张三");
        hm.put("age", "20");
        hm.put("gender", "男");
        hm.put("height", "180");
    }

    public void clear() {
        hm.clear();
    }

    public HashMap<String,String> getHashMap(){
        return hm;
    }

    public int getSize() {
        return hm.size();
    }

    public boolean hasKey(String key) {
        return hm.containsKey(key);
    }

    public boolean hasValue(String value) {
        return hm.containsValue(value);
    }

    public Map.Entry<String, String> getEntry(String key) {
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry<String, String> entry : entries
        ) {
            if (entry.getKey().equals(key)) {
                return entry;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.initialize();
        System.out.println("has key:name? " + hashMapDemo.hasKey("name"));
        System.out.println("has value:李四? " + hashMapDemo.hasValue("李四"));
        System.out.println(hashMapDemo.getEntry("name"));
    }
}
