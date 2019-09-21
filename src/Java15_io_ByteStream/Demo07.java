package Java15_io_ByteStream;

import java.io.*;

/**
 * @author sucre
 * @date 2019-09-21
 * @time 19:43
 * @description 序列流
 */
/*
    序列流可以把多个字节输入流整合成一个, 从序列流中读取数据时,
    将从被整合的第一个流开始读, 读完一个之后继续读第二个, 以此类推.

 */
public class Demo07 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream1 = new FileInputStream(".\\src\\Java15_io_ByteStream\\a.txt");
        FileInputStream fileInputStream2 = new FileInputStream(".\\src\\Java15_io_ByteStream\\b.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(".\\src\\Java15_io_ByteStream\\c.txt");

        SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1,fileInputStream2);

        int b = 0;
        while((b=sequenceInputStream.read())!=-1){
            fileOutputStream.write(b);
        }

        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();

        System.out.println("文件拷贝完成！");
    }
}
