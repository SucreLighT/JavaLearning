package Java10_collectionDemo;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author sucre
 * @date 2019-08-08
 * @time 09:35
 * @description TreeSet
 */

public class TreeSetDemo {
    public static void main(String[] args) {
//        fun1();
        fun2();

    }

    /*
        TreeSet保存自定义对象时
        1.自定义对象必须实现comparable接口
        2.实现comparable接口的compareTo方法

        compareTo方法返回值：0 只存一个元素，第一个元素
				            -1 存的顺序倒序
				             1 存的顺序正序
     */

    private static void fun2() {
        Set<Student> set = new TreeSet<Student>();
        set.add(new Student("张三", 20));
        set.add(new Student("李四", 21));
        set.add(new Student("王二", 22));

        for (Student stu:set
             ) {
            System.out.println(stu);
        }
    }

    /*
   TreeSet是一种能排序集合
   默认情况下，TreeSet存Integer时，由小到大排序
   默认情况下，TreeSet存String时，字母的由小到大排序
   Integer和String这两个类都内部实现了comparable接口
 */
    private static void fun1() {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(7);
        set.add(1);

        System.out.print(set+" ");
    }
}
