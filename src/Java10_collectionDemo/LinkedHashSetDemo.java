package Java10_collectionDemo;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author sucre
 * @date 2019-08-05
 * @time 10:36
 * @description LinkedHashSet
 */

/*
    LinkedHashSet
   LinkedHashSet是HashSet的子类
   LinkedHashSet 存和取的顺序是一样
   是Set集合中唯一能保证存取顺序一致的集合
   是Set集合中唯一能保证存取顺序一致的集合
 */

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Student> set = new LinkedHashSet<Student>();
        set.add(new Student("a",20));
        set.add(new Student("c",20));
        set.add(new Student("e",20));
        set.add(new Student("b",20));
        set.add(new Student("d",20));
        System.out.println(set);    //若没有重写hashCode和equals方法，会输出五个元素
    }
}
