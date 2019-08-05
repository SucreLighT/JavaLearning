package collectionDemo;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * @author sucre
 * @date 2019-08-05
 * @time 10:12
 * @description HashSet例题
 */

public class Demo06 {
    public static void main(String[] args) {

//        fun1();
        fun2();
    }

    //从键盘读取一行输入，去除重复的字符
    private static void fun2() {
        Set<Character> set = new HashSet<Character>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            set.add(ch);
        }
        System.out.println(set);
    }


    //生成10个0到20的随机数且不重复
    private static void fun1() {
        Set<Integer> set = new HashSet<Integer>();
        Random r = new Random();
        while (set.size()<10){
            set.add(r.nextInt(21));
        }
        System.out.println("0-20内十个不重复随机数："+set);
    }
}
