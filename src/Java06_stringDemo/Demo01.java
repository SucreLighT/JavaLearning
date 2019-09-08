package Java06_stringDemo;

/**
 * String构造方法
 * public String() 空参构造方法
 * public String(byte[] bytes) 把字节数组转成字符串
 * public String(byte[] bytes,int index,int length) 把字节数组的一部份转成字符串
 * public String(char[] value,int index,int count) 把字符数组的一部份转成字符串
 * public String(String original)   初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；
 *                                  换句话说，新创建的字符串是该参数字符串的副本。
 */
public class Demo01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:"+s1);

        byte[] bytes = {97,98,99,100,101};
        String s2 = new String(bytes);
        System.out.println("s2:"+s2);

        String s3 = new String(bytes,0,3);
        System.out.println("s3:"+s3);

        char[] chars = {'a','b','c','d','e','f','g'};
        String s4 = new String(chars,0,4);
        System.out.println("s4:"+s4);

        String s5 = new String("hello");
        System.out.println("s5:"+s5);
    }
}
