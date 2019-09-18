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
    FileReader类的read方法返回的值是int类型，是将对应的字符转换成int值
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
