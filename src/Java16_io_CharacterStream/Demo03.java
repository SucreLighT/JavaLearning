package Java16_io_CharacterStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sucre
 * @date 2019-09-21
 * @time 19:21
 * @description 使用带缓冲的字符流BufferedReader、BufferedWriter将文本反转写入到另一个文件中
 */

/*
    BufferedReader的readLine()方法用于每次读取一行数据
    BufferedWriter的newLine()方法用于写文件时，添加换行，相当于”\r\n”
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(".\\src\\Java16_io_CharacterStream\\a.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter(".\\src\\Java16_io_CharacterStream\\b.txt"));

        List<String> list = new ArrayList<>();

        String line = null;
        while((line=reader.readLine())!= null){
            list.add(line);
        }

        for(int i = list.size() - 1; i >= 0; i--){
            writer.write(list.get(i));
            writer.newLine();
        }

        reader.close();
        writer.close();
        System.out.println("文件拷贝完成！");
    }
}
