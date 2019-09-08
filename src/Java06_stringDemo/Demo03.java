package Java06_stringDemo;

/**
 * public boolean equals(Object anObject)  判断字符串是否一样
 * public boolean equalsIgnoreCase(String anotherString) 判断字符串是否一样，忽略大小写
 * public boolean contains(CharSequence s) 判断字符串是否包含哪字符串
 * public boolean startsWith(String prefix) 判断字符串是否以什么开头
 * public boolean endsWith(String suffix) 判断字符串是否以什么结尾
 * public boolean isEmpty() 判断字符串是否为空字符串
 */
public class Demo03 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab" + "c";
        System.out.println(s1.equals(s2));

        String s3 = "Abc";
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println(s1.contains("bc"));
        System.out.println(s1.startsWith("ab"));
        System.out.println(s3.startsWith("ab"));
    }
}
