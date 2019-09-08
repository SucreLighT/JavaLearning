package Java06_stringDemo;

/**
 * String类的其它功能
 * public String replace(char oldChar, char newChar)//替换字符
 * public String replace(CharSequence target, CharSequence replacement) //替换字符串
 * String trim();//去除前后空格
 * public int compareTo(String anotherString) //比较
 * public int compareToIgnoreCase(String str) //比较
 */

public class Demo08 {
    public static void main(String[] args) {

        String s1 = "hello";
        s1 = s1.replace('l', 'y');
        System.out.println("s1:" + s1);

        String s2 = " I Love You! ";
        s2 = s2.replace("Love", "Hate");
        System.out.println("s2:" + s2);

        String s3 = s2.trim();
        System.out.println("s3:" + s3);

        String s4 = "abc";
        String s5 = "abc";
        int result = s4.compareTo(s5);
        System.out.println("s4 pk s5 = " + result);

        String s6 = "AbB";
        String s7 = "aBc";
        System.out.println("s6 pk s7 = " + s6.compareToIgnoreCase(s7));
    }
}
