package Java15_io_ByteStream;

import java.io.*;

/**
 * @author sucre
 * @date 2019-09-09
 * @time 20:13
 * @description IO流概述、FileInputStream、FileOutputStream
 */

/*
    IO流概述：
    1.字节流 : 字节流可以操作任何数据,因为在计算机中任何数据都是以字节的形式存储的
      字符流 : 字符流只能操作纯字符数据

    2.读取数据：字节流InputStream、字符流Reader
      写入数据：字节流OutputStream、字符流Writer

    3.InputStream是抽象类，表示字节输入流,用于读数据。
      已知直接子类：AudioInputStream,ByteArrayInputStream,FileInputStream,FilterInputStream,ObjectInputStream,
      PipedInputStream,SequenceInputStream,StringBufferInputStream、

    4.OutputStream译为输出流，是一个抽象类，它用于往文件里写入内容
    已知直接子类：ByteArrayOutputStream,FileOutputStream,FilterOutputStream,ObjectOutputStream,
      PipedOutputStream
 */

public class Demo01 {
    public static void main(String[] args) throws IOException {
//        FileInputFun();

        FileOutputFun();
        return;

    }

    /*
    FileOutputStream表示文件输出流，用于往文件写内容

    write()方法
    write(int b);       //每次写一个字节
    write(byte[] b) ;   //一次写多个字节
    */
    private static void FileOutputFun() throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("D:\\Java\\" +
                "workplace\\JavaLearning\\src\\Java15_io_ByteStream\\b.txt");  //多态写法
        fileOutputStream.write(97);

        byte[] bytes = {98,99,100,101};
        fileOutputStream.write(bytes);

        fileOutputStream.close();
    }


    /*
    FileInputStream
    从文件系统中的某个文件中获得输入字节,用于读取诸如图像数据之类的原始字节流。
    要读取字符流，考虑使用 FileReader。

    int read()方法 每次读取文件中的一个字节，并将该字节转换为int值返回，读取结束时返回-1
    注意：read()方法返回的事int的原因
    读数据时可能遇到111111111，byte类型下值为-1,程序遇到-1就会停止,
    用int类型接收时,int是4字节32位，11111111会在其前面补上24个0凑足4个字节,
    那么byte类型的-1就变成int类型的255了这样可以保证整个数据读完,而结束标记的-1就是int类型
    */
    private static void FileInputFun() throws IOException {
        File file1 = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java15_io_ByteStream\\a.txt");
        FileInputStream fileInputStream1 = new FileInputStream(file1);

        int b = 0;
        while((b = fileInputStream1.read()) != -1){
            System.out.println(b);
        }
        fileInputStream1.close();
    }
}
