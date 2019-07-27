package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
