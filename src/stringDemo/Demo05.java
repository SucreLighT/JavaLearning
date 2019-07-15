package stringDemo;

/**
 * String类的获取功能
 * int length():获取字符串的长度,而非字节长度
 * char charAt(int index):获取指定索引位置的字符
 * int indexOf(int ch):获取指定字符在此字符串第一次出现处的索引
 * int indexOf(String str)：返回指定字符串在此字符串中第一次出现处的索引
 * int indexOf(int ch,int fromIndex):返回指定字符在此字符串中指定位置后第一次出现处的索引
 * int indexOf(String str,int fromIndex):返回指定字符串在此字符串中指定位置后第一次出现处的索引
 * lastIndexOf() 最后出现的位置
 * String substring(int start):从指定位置开始截取字符串，默认到未尾
 * String substring(int start,int end):从指定位置开始到指定位置结束截取字符图,包括start不包括end
 */

public class Demo05 {
    public static void main(String[] args) {
        String s1 = "hello world!";
        System.out.println("s1的长度：" + s1.length());

        System.out.println(s1.charAt(1));
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.indexOf("lo"));
        System.out.println(s1.indexOf('o',5));
        System.out.println(s1.substring(6,11));
    }
}
