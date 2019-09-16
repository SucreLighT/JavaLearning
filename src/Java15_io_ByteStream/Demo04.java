package Java15_io_ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author sucre
 * @date 2019-09-16
 * @time 14:53
 * @description 字节流中中文的问题
 */

/*
    在UTF-8编码中，一个中文占3个字节，在GBK编码中，一个中文占2个字节

    使用字节流读取中文时，可能会出现读取到半个中文的情况，从而产生乱码
    解决方法：使用字符流读取
 */

public class Demo04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(".\\src\\Java15_io_ByteStream\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(".\\src\\Java15_io_ByteStream\\b.txt");


//        byte buf[] = new byte[2]; 缓冲区大小为2时会读取到半个中文导致乱码
        byte buf[] = new byte[3];
        int len = 0;
        while ((len = fileInputStream.read(buf)) != -1) {
            System.out.println("len:" + len);
            String s = new String(buf, 0, len);
            System.out.println("s:" + s);

            fileOutputStream.write(buf);
            fileOutputStream.write("\r\n".getBytes()); // 写入换行
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
