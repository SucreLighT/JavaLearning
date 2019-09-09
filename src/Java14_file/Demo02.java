package Java14_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sucre
 * @date 2019-09-09
 * @time 10:36
 * @description 文件获取功能
 */

/*
    public String getAbsolutePath()：获取绝对路径
    public String getPath():获取路径
    public String getName():获取名称

    ***下述两方法要保证file对象的路径为绝对路径***
    public long length():获取长度（字节数）
    public long lastModified():获取最后一次的修改时间，毫秒值

    public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
    public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 */

public class Demo02 {
    public static void main(String[] args) {
        File file1 = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\a\\a.txt");
        System.out.println("文件的绝对路径：" + file1.getAbsolutePath());
        System.out.println("文件的路径：" + file1.getPath());
        System.out.println("文件的名称：" + file1.getName());
        System.out.println("文件的长度：" + file1.length() + "字节");

        long time = file1.lastModified();
        System.out.println("文件最后修改时间：" + time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date(time);
        System.out.println(sdf.format(date));

        System.out.println("=============");

        File file2 = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\b");
        String[] filelist = file2.list();
        System.out.println(file2+"目录下所有文件：");
        for (String f:filelist
             ) {
            System.out.println(f);
        }

        System.out.println("各文件的绝对路径：");
        File[] fs = file2.listFiles();
        for (File f:fs
             ) {
            System.out.println(f.getAbsolutePath());
        }


    }
}
