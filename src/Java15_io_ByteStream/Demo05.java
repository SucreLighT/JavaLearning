package Java15_io_ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author sucre
 * @date 2019-09-16
 * @time 15:10
 * @description 流的异常处理方式
 */

/*
    1.把流对象的声明放在try() 括号里面
    2.操作流【读写数据】的代码放在花括号里面
    3.这样写不用关闭流，java自动关闭流
    4.如果使用自定义对象，在try的括号里的对象，必须实现AutoCloseable接口(该接口查看InputStream类)
 */

public class Demo05 {
    public static void main(String[] args) throws Exception {
        try(
                FileInputStream fileInputStream = new FileInputStream(".\\src\\Java15_io_ByteStream\\a.txt");
                FileOutputStream fileOutputStream = new FileOutputStream(".\\src\\Java15_io_ByteStream\\b.txt");
                MyInputStream myInputStream = new MyInputStream();
                ){
            int b = 0;
            while ((b = fileInputStream.read()) != -1){
                fileOutputStream.write(b);
            }
        }
    }
}

class MyInputStream implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("我的输入流关闭了...");
    }
}