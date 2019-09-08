package Java05_scannerDemo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
//        test1();
        test2();
    }


    //获取两个int值
    public static void test1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int x = scanner.nextInt();

        System.out.println("请输入第二个数字：");
        int y = scanner.nextInt();

        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }

    //获取两个字符串
    public static void test2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String s1 = scanner.nextLine();

        System.out.println("请输入第二个字符串：");
        String s2 = scanner.nextLine();

        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);
    }
}

