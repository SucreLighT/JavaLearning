package Java07_stringBufferDemo;

/**
 * StringBuffer与String的相互转换
 * String –> StringBuffer
 * 	通过构造方法
 * 	通过append()方法
 * StringBuffer -> String
 * 	通过构造方法
 * 	通过toString()方法
 * 	通过subString(star,end);
 */
public class Demo04 {
    public static void main(String[] args) {
        String s = "hello";
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer);

        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(s);
        System.out.println(stringBuffer1);


    }
    public static void test(){
        StringBuffer stringBuffer = new StringBuffer("hello world!");
        String s1 = new String(stringBuffer);
        String s2 = stringBuffer.toString();
        String s3 = stringBuffer.substring(0);
    }
}
