package arraysDemo;

import java.util.Arrays;

/**
 * @author sucre
 * @date 2019-07-24
 * @time 14:30
 * @description
 * toString()方法将数组转成固定格式的字符串
 * sort()方法将数组进行排序
 * binarySearch()方法对数组进行二分查找
 *  如果二分查找的key不存在，返回一个负数，负数的绝对值表示该key按照顺序在数组中的位置
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr1 = {28,12,2,36,54};

        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int index = Arrays.binarySearch(arr1,28);
        System.out.println(index);
    }
}
