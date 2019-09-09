package Java14_file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author sucre
 * @date 2019-09-09
 * @time 10:58
 * @description 文件过滤
 */

/*
    过滤指定目录下的.jpg文件
 */
public class Demo03 {
    public static void main(String[] args) {
//        fun1();

        fun2();
    }

    /*
        使用文件名过滤类FilenameFilter
        重写accept方法，该方法将满足条件的文件名返回到数组subfiles中
     */
    private static void fun2() {
        File file = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\b");

        String[] subfiles=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });
        for (String f:subfiles
        ) {
                System.out.println(f);
        }
    }

    private static void fun1() {
        File file = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\b");
        String[] filesname = file.list();

        for (String f:filesname
             ) {
            if (f.endsWith(".jpg"))
                System.out.println(f);
        }
    }
}
