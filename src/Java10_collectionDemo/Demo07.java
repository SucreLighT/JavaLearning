package Java10_collectionDemo;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author sucre
 * @date 2019-08-09
 * @time 10:20
 * @description TreeSet例题
 */

public class Demo07 {
    public static void main(String[] args) {
//        fun1();
//        fun2();
    }

    //      从键盘输入接收多个整数, 直到输入quit时结束输入. 把所有输入的整数倒序排列打印
    private static void fun2() {
        Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//倒序排列
            }
        });

        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            if(str.equals("quit")) break;

            set.add(Integer.parseInt(str));
        }
        for (Integer i:set
             ) {
            System.out.println(i);
        }
    }

    //      在一个集合中存储了无序并且重复的字符串,让其有序(字母顺序),而且还不能去除重复
    private static void fun1() {
        Set<String> names = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = o1.compareTo(o2); //由小到大
                num = num ==0 ? 1:num;      //如果num是0让其变为1，保证重复元素排在其后面
                return num;
            }
        });
        names.add("apple");
        names.add("banana");
        names.add("orange");
        names.add("banana");

        for (String s:names
             ) {
            System.out.println(s);
        }
    }
}
