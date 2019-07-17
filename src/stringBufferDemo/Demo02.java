package stringBufferDemo;

/**
 * StringBuffer的添加方法
 * 1.public StringBuffer append(String str):
 * 可以把任意类型数据添加到“字符串缓冲区”里面,并返回字符串缓冲区本身
 * 2.public StringBuffer insert(int offset,String str):
 * 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
 */
public class Demo02 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello ");
        stringBuffer.append("world" );

        stringBuffer.insert(6,"fucking ");

        System.out.println(stringBuffer);
    }
}
