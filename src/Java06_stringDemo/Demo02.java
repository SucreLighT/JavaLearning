package Java06_stringDemo;

/**
 * String类是可共享的常量，所以内容相同的String变量，内存地址相同
 */
public class Demo02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 ==s2);    //比较两个内存地址
        System.out.println(s1.equals(s2));  //比较两个内容

    }
}
