package stringBufferDemo;

/**
 * 1.StringBuffer线程安全的可变字符序列
 * 2.StringBuffer内部实现是字符数组
 * 3.StringBuffer和String的区别
 * String是一个不可变的字符序列
 * StringBuffer是一个可变的字符序列
 * StringBuffer线程安全,可以加锁
 */
public class Demo01 {
    public static void main(String[] args) {

        /*
        public StringBuffer():空参构造方法
		构造一个其中不带字符的字符串缓冲区，初始容量为 16 个字符。
         */
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("s的容量：" + stringBuffer.capacity());//打印字符数组容量
        System.out.println("s的长度：" + stringBuffer.length());//打印字符数组长度

        /*
        public  StringBuffer(int capacity) :
		构造一个不带字符，但具有指定初始容量的字符串缓冲区。
         */
        StringBuffer stringBuffer1 = new StringBuffer(24);
        System.out.println("s1的容量：" + stringBuffer1.capacity());
        System.out.println("s1的长度：" + stringBuffer1.length());

        /*
        public  StringBuffer(CharSequence seq):
		构造一个字符串缓冲区，它包含与指定的 CharSequence 相同的字符。
         */
        StringBuffer stringBuffer2 = new StringBuffer("hello world!");//容量：在初始值16上加上长度12
        System.out.println("s2:" + stringBuffer2);
        System.out.println("s2的容量：" + stringBuffer2.capacity());
        System.out.println("s2的长度：" + stringBuffer2.length());
    }
}
