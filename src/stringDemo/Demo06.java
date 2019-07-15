package stringDemo;

/**
 * String类转换功能
 * byte[] getBytes():把字符串转换为字节数组
 * char[] toCharArray()：把字符串转换为字符数组
 * static String valueOf(char[] chs)：把字符数组转成字符串
 * static String valueOf(int i)：把int类型的数据转成字符串
 * 注意:String类的valueOf方法可以把任意类型的数据转成字符串
 * String toLowerCase()：把字符串转成小写
 * String toUpperCase()：把字符串转成大写
 * String concat(String str)：把字符串拼接,且只能拼接字符串。+方式拼接字符串时，可以是任意类型
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.println("============byte[] getBytes():把字符串转换为字节数组============");
        String s1 = "520java";
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println("============char[] toCharArray()：把字符串转换为字符数组============");
        String s2 = "java";
        char[] chars = s2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("============static String valueOf(char[] chs)：把字符数组转成字符串============");
        char[] chars1 = {'a','b','c','d','e'};
        String s3 = String.valueOf(chars1);
        System.out.println("s3:" + s3);

        System.out.println("============static String valueOf(int i)：把int类型的数据转成字符串==========");
        System.out.println(String.valueOf(100));

        System.out.println("============String toLowerCase()：把字符串转成小写;String toUpperCase()：把字符串转成大写==========");
        String s4 = "hello WORLD";
        System.out.println(s4.toUpperCase());
        System.out.println(s4.toLowerCase());

        String s5 = s4.concat(s2);
        System.out.println(s5);
    }
}
