package Java10_collectionDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author sucre
 * @date 2019-08-08
 * @time 10:15
 * @description TreeSetSort
 */

/*
    TreeSet排序原理
>TreeSet的特点:
 --TreeSet是用来排序的, 可以指定一个顺序, 对象存入之后会按照指定的顺序排列
 --TreeSet排序方式有两种自然顺序和比较器顺序

  自然顺序(Comparable)
	TreeSet类的add()方法中会把存入的对象提升为Comparable类型
	调用对象的compareTo()方法和集合中的对象比较
	根据compareTo()方法返回的结果进行存储

  比较器顺序(Comparator)
	创建TreeSet的时候可以制定一个Comparator
	如果传入了Comparator的子类对象,那么TreeSet就会按照比较器中的规则比较
	add()方法内部会自动调用Comparator接口中compare()方法排序
	调用的对象是compare方法的第一个参数,集合中的对象是compare方法的第二个参数
	使用场景：如果元素的类型是final类型，不被重写，这个时候选择Comparator排序方式

--两种比较方式的区别
	1.TreeSet构造函数什么都不传, 默认按照类中Comparable的顺序(没有就报错ClassCastException)
	2.TreeSet如果传入Comparator, 就优先按照Comparator
 */

public class TreeSetSortDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new MyComparator());
        set.add(1);
        set.add(23);
        set.add(33);
        set.add(13);

        for (Integer i:set
             ) {
            System.out.println(i);
        }
    }
}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}