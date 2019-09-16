package Java15_io_ByteStream;

import java.io.*;

/**
 * @author sucre
 * @date 2019-09-16
 * @time 08:57
 * @description 带缓冲区的输入输出流 BufferedInputStream、BufferedOutputStream
 */

/*
    BufferedInputStream、BufferedOutputStream内置了一个缓冲区(数组)，构造方法参数为对应的输入或输出流

    当使用BufferedInputStream读取一个字节时，BufferedInputStream会一次性从文件中读取8192个(8Kb),
    存在缓冲区中,直到缓冲区装满了, 才重新从文件中读取下一个8192个字节数组

    向流中写入字节时, 先写到缓冲区中直到缓冲区写满,
    BufferedOutputStream才会把缓冲区中的数据一次性写到文件里
 */

public class Demo03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(".\\src\\Java15_io_ByteStream\\music.mp3");
        FileOutputStream fileOutputStream = new FileOutputStream(".\\src\\Java15_io_ByteStream\\music1.mp3");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        int b = 0;
        while((b = bufferedInputStream.read()) != -1){
            bufferedOutputStream.write(b);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();

        System.out.println("音频拷贝完成！");
    }
}
