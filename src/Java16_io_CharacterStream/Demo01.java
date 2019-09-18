package Java16_io_CharacterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sucre
 * @date 2019-09-18
 * @time 16:28
 * @description 字符流FileReader、FileWriter
 */

/*
    字节流、字符流使用场景：字符读文件，字节写文件！！！
    如果是读取文本文件，使用FileReader比较好,不考虑乱码问题
    如果是写入文本文件，不建议使用FileWriter,直接使用FileOutputStream好一点
    因为是字节直接写入文件，不需要过多数据类型转换
 */

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(".\\src\\Java16_io_CharacterStream\\a.txt");
        FileWriter fileWriter = new FileWriter(".\\src\\Java16_io_CharacterStream\\a.txt");
        fileWriter.write("你好");
        fileWriter.write("\r\n");//换行
        fileWriter.write("中国");
        fileWriter.close();

        int c;
        while((c=fileReader.read()) != -1){
            System.out.println((char) c);
        }
        fileReader.close();


    }
}
