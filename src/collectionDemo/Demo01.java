package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author sucre
 * @date 2019-07-26
 * @time 16:20
 * @description 集合类
 */

/*
    1.数组可以存储基本数据类型，也可以存储引用数据类型
    集合只能存储引用数据类型（对象），也可以存储基本数据类型，但是会自动装箱

    2.数组长度是固定的，集合长度可变
    元素个数不固定时建议使用集合
 */

/*
    基本方法：
    boolean add(E e) 添加元素
    boolean remove(Object o) 删除元素
    void clear() 清除元素
    boolean contains(Object o) 包含某一个元素
    boolean isEmpty() 判断集合是否为空
    int size() 获取集合的大小
 */

public class Demo01 {
    public static void main(String[] args) {

        Collection coll = new ArrayList();// 接口指向实现类（多态）
        coll.add("Java");
        coll.add("PHP");
        coll.add("Python");
        System.out.println(coll);

        coll.remove("PHP");
        System.out.println(coll);

//        coll.clear();
//        System.out.println(coll);
//        System.out.println(coll.isEmpty());

        System.out.println(coll.contains("Python"));
        System.out.println(coll.size());
    }
}
