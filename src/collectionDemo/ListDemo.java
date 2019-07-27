package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 * @author sucre
 * @date 2019-07-27
 * @time 09:28
 * @description List集合
 */

public class ListDemo {
    public static void main(String[] args) {
//        fun1();
//        fun2();

        fun();
    }

    /*	 ListIterator
         boolean hasNext()是否有下一个
         boolean hasPrevious()是否有前一个
         Object next() 返回下一个元素
         Object previous();返回上一个元素
    */
    private static void fun() {
        List list = new ArrayList();
        list.add("小胡");
        list.add("小官");
        list.add("小魏");
        list.add("小刘");
        list.add("小郭");

        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

        System.out.println("=========");
        while (iterator.hasPrevious()) {//判断是否有上一个元素
            //取出上一个元素
            Object obj = iterator.previous();
            System.out.println(obj);
        }
    }

    // list集合的遍历
    private static void fun2() {
        List list = new ArrayList();
        list.add(new Student("apple",12));
        list.add(new Student("banana",22));
        list.add(new Student("orange",32));

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    // list基本方法
    private static void fun1() {
        List list = new ArrayList();
        list.add("Java");
        list.add("PHP");
        list.add("Go");
        list.add("C++");

        System.out.println(list);

        // 在指定位置插入元素
        list.add(2,"Python");
        System.out.println(list);

        // 删除指定位置元素
        list.remove(0);
        System.out.println(list);

        // 获取指定位置元素
        System.out.println(list.get(1));

        // 替换指定位置元素
        list.set(3,"C");
        System.out.println(list);
    }
}
