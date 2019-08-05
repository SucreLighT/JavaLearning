package collectionDemo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author sucre
 * @date 2019-08-05
 * @time 09:24
 * @description HashSet
 */

/*
   1.此类实现 Set 接口
   2.由哈希表（实际上是一个 HashMap 实例）支持。
   3.它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。
   4.此类允许使用 null 元素。
 */

/*
    Set遍历一、增强for循环
    Set遍历二、迭代器
 */

public class HashSetDemo {
    public static void main(String[] args) {
        Set <String> set = new HashSet<String>();

        set.add("b");
        set.add("c");
        set.add("a");
        set.add("c");
        set.add(null);

        for (String str:set
        ) {
            System.out.print(str+" ");
        }

        System.out.println("\n=============");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
