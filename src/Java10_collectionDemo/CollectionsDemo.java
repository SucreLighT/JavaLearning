package Java10_collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sucre
 * @date 2019-08-13
 * @time 10:41
 * @description Collections集合工具类
 */

/*
    Collections成员方法
	public static <T> void sort(List<T> list) 排序
	public static <T> int binarySearch(List<?> list,T key) 二分查找
	public static <T> T max(Collection<?> coll) 取大值
	public static void reverse(List<?> list) 反转
	public static void shuffle(List<?> list) 打乱顺序
 */

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(13);
        list.add(23);
        list.add(7);
        list.add(123);
        System.out.println("list:"+list);
        Collections.sort(list);
        System.out.println("list:"+list);

        System.out.println("index:"+Collections.binarySearch(list,13));
        System.out.println("max:"+Collections.max(list));

        Collections.reverse(list);
        System.out.println("list:"+list);

        Collections.shuffle(list);
        System.out.println("list:"+list);
    }
}
