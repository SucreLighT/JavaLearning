package Java17_io_OtherStream;


import java.io.*;

/**
 * @author sucre
 * @date 2019-09-23
 * @time 10:10
 * @description 数据输入输出流
 */

/*
    DataInputStream, DataOutputStream可以按照基本数据类型大小读写数据
    例如按Long大小写出一个数字, 写出时该数据占8字节.
    读取的时候也可以按照Long类型读取, 一次读取8个字节.
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(".\\src\\Java17_io_OtherStream\\a.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        long a = 997;
        long b = 998;
        long c = 999;

        dataOutputStream.writeLong(a);
        dataOutputStream.writeLong(b);
        dataOutputStream.writeLong(c);

        DataInputStream dis = new DataInputStream(new FileInputStream(".\\src\\Java17_io_OtherStream\\a.txt"));
        System.out.println(dis.readLong());//读8个字节
        System.out.println(dis.readLong());//读8个字节
        System.out.println(dis.readLong());//读8个字节

        dis.close();
        dataOutputStream.close();
    }
}
