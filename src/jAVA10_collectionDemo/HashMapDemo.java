package jAVA10_collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author sucre
 * @date 2019-08-10
 * @time 09:44
 * @description HashMap的遍历
 */

public class HashMapDemo {
    public static void main(String[] args) {
//        fun1();
        fun2();
    }

    /*
        使用键值对对象Entry进行遍历
        1.Map.Entry理解成"键值对对象"
	    2.Map.Entry是一个接口，它的实现类是HashMap$Node
	    3.Map.Entry是有个key和value属性，通过get方法可以取值
	    4.遍历Entry的两种方法，通过迭代器和for增强
     */
    private static void fun2() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","张三");
        map.put("age","20");
        map.put("gender","男");
        map.put("height","180");
        
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry:entries
             ) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key+"："+value);
        }
    }

    //根据key进行遍历
    private static void fun1() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","张三");
        map.put("age","20");
        map.put("gender","男");
        map.put("height","180");

        //使用Set集合存储key，遍历的结果顺序与存储顺序不一致
        for (String key:map.keySet()
             ) {
            System.out.println(key+"："+map.get(key));
        }
    }
}
