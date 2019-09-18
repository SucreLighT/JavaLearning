package Java16_io_CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sucre
 * @date 2019-09-18
 * @time 16:44
 * @description 使用字符流进行文件拷贝
 */

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(".\\src\\Java16_io_CharacterStream\\a.txt");
        FileWriter fileWriter = new FileWriter(".\\src\\Java16_io_CharacterStream\\b.txt");

        char[] buf = new char[8 * 1024];

        int len = 0;
        while((len=fileReader.read(buf)) != -1){
            fileWriter.write(buf,0,len);
        }

        fileReader.close();
        fileWriter.close();

        System.out.println("文件拷贝完成！");
    }
}
