package Java15_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author sucre
 * @date 2019-09-11
 * @time 16:17
 * @description 文件拷贝案例
 */

/*
    使用输入流读取图片，使用输出流写入数据
 */

public class Demo02 {
    public static void main(String[] args) throws IOException {
//        fun1();
//        fun2();
//        fun3();
    }

    /*
        文件拷贝常用方法！！！
        定义一个缓冲区，先将文件读入到缓冲区，再将缓冲区中数据写入到文件
     */
    private static void fun3() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(".\\src\\Java15_io\\picture.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(".\\src\\Java15_io\\picture1.jpg");

        //设置缓冲区大小
        byte[] bytes = new byte[1024 * 8];

        int len = 0;
        //每次读取缓冲区长度的数据，并写入到拷贝文件中
        while ((len = fileInputStream.read(bytes)) != -1) {
            /*
                将缓冲区中数据写入文件
                当最后一次读取时，缓冲区可能未满
                所以写入的长度为0-len而不能使用bytes全部长度
             */
            fileOutputStream.write(bytes, 0, len);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    /*
    字节数组拷贝的available()方法,返回文件大小
    一次读取文件大小的字节，存储到字节数组中，将字节数组一次性写入到新文件中
    不建议用于大文件的拷贝
    */
    private static void fun2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(".\\src\\Java15_io\\picture.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(".\\src\\Java15_io\\picture1.jpg");

        int size = fileInputStream.available();
        System.out.println("文件大小：" + size);

        byte[] bytes = new byte[size];
        int r = fileInputStream.read(bytes);
        fileOutputStream.write(bytes);

        fileInputStream.close();
        fileOutputStream.close();
    }

    /*
        每次读取一字节，效率低下
     */
    private static void fun1() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(".\\src\\Java15_io\\picture1.jpg");
        FileInputStream fileInputStream = new FileInputStream(".\\src\\Java15_io\\picture.jpg");

        int b = 0;
        while ((b = fileInputStream.read()) != -1) {
            fileOutputStream.write(b);
        }

        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("图片拷贝成功！");
    }
}
