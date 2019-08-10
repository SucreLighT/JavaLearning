package collectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author sucre
 * @date 2019-08-10
 * @time 09:16
 * @description Map集合
 */


/*
    Map<K,V>
类型参数：
	K - 映射所维护的键的类型
	V - 映射值的类型
Map是将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。

Map接口和Collection接口的不同
--Map是双列的,Collection是单列的
--Map的键唯一,Collection的Set是唯一的,List不是惟一的

Map：有几个常用的子类HashMap,LinkedHashMap,TreeMap,Hashtable,Properites
*/

/*
Map的功能
a>添加功能
	V put(K key,V value):添加元素。
	如果键是第一次存储，就直接存储元素，返回null
	如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
b>删除功能
	void clear():移除所有的键值对元素
	V remove(Object key)：根据键删除键值对元素，并把值返回
c>判断功能
	boolean containsKey(Object key)：判断集合是否包含指定的键
	boolean containsValue(Object value):判断集合是否包含指定的值
	boolean isEmpty()：判断集合是否为空
d>获取功能
	V get(Object key):根据键获取值
	Set<K> keySet():获取集合中所有键的集合
	Collection<V> values():获取集合中所有值的集合
e>长度功能
	int size()：返回集合中的键值对的个数
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();

        map.put(1,"a");
        map.put(2,"b1");
        map.put(3,"c");
        System.out.println(map.put(2,"b2"));//key=2已经存在，返回之前的值b1，并存储现在的值b2
        System.out.println("map:"+map);

//        map.clear();
        map.remove(3);
        System.out.println("==========================");
        System.out.println("map:"+map);

        System.out.println("==========================");
        System.out.println("map中是否存在key=1？："+map.containsKey(1));
        System.out.println("map中是否存在key=4？："+map.containsKey(4));
        System.out.println("map中是否存在value=b1？："+map.containsValue("b1"));
        System.out.println("map中是否存在value=b2？："+map.containsValue("b2"));
        System.out.println("map是否为空？："+map.isEmpty());

        System.out.println("==========================");
        System.out.println("map中key=2对应的值为："+map.get(2));
        Set<Integer> set = map.keySet();
        System.out.println("map中所有的key："+set);
        Collection<String> collection = map.values();
        System.out.println("map中所有的value："+collection);

        System.out.println("==========================");
        System.out.println("map的长度："+map.size());

    }
}
