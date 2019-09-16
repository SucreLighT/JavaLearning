package Java15_io_ByteStream;

import java.io.*;
import java.util.Scanner;

/**
 * @author sucre
 * @date 2019-09-16
 * @time 15:21
 * @description 字节流练习题
 */

/*
    根据用户输入的文件路径拷贝该文件到项目目录下
 */

public class Demo06 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件路径（不要是文件夹路径！）：");
        String path = scanner.nextLine();

        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("该路径为文件夹路径，不符合要求！");
            return;
        }

        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(".\\src\\Java15_io_ByteStream\\copy-" + file.getName());

        byte buf[] = new byte[8 * 1024];
        int len = 0;
        while ((len = fileInputStream.read(buf)) != -1) {
            fileOutputStream.write(buf, 0, len);
        }

        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("文件拷贝完成！");
    }
}
