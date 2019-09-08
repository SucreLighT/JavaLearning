package Java07_stringBufferDemo;

/**
 * StringBuffer的删除方法
 * deleteCharAt(int index) 删除指定索引的字符
 * delete(int start,int end): 删除开始到结束位置的字符
 *
 * StringBuffer的反转功能
 * reverse()方法，将字符串反转
 *
 * StringBuffer的截取功能
 * public String substring(int start): 从指定位置截取到末尾
 * public String substring(int start,int end): 截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
 */
public class Demo03 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello world!");
        System.out.println("s:" + stringBuffer);

        stringBuffer.deleteCharAt(11);
        System.out.println("删除感叹号 s:" + stringBuffer);

        stringBuffer.delete(0,5);
        System.out.println("删除hello s:"+stringBuffer);

        stringBuffer.reverse();
        System.out.println("s反转:"+stringBuffer);

        System.out.println("s:"+stringBuffer.substring(0,2));
    }
}
