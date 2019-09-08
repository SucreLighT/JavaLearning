package Java10_collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author sucre
 * @date 2019-07-26
 * @time 16:59
 * @description 集合类的遍历
 */

/*
    使用迭代器iterator及其中的hasNext() next()方法进行数组的遍历
 */
public class Demo02 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("apple");
        coll.add("banana");
        coll.add("orange");

        System.out.println("转为数组遍历：");
        fun1(coll);

        System.out.println("使用迭代器遍历：");
        fun2(coll);
    }

    private static void fun2(Collection coll) {
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }
    }

    private static void fun1(Collection coll) {
        // 集合转成数组进行遍历
        Object[] object = coll.toArray();
        for (Object o:object
        ) {
            System.out.println(o);
        }
    }
}
