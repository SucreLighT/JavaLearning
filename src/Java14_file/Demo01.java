package Java14_file;

import java.io.File;
import java.io.IOException;

/**
 * @author sucre
 * @date 2019-09-09
 * @time 09:42
 * @description 文件基本操作
 */


public class Demo01 {
    public static void main(String[] args) {
//        FileConstructor();
//        FileCreat();
//        FileRename();
//        FileDelete();

        /*
            其他判断函数：
            public boolean isDirectory():判断是否是目录
            public boolean isFile():判断是否是文件
            public boolean exists():判断是否存在
            public boolean canRead():判断是否可读
            public boolean canWrite():判断是否可写
            public boolean isHidden():判断是否隐藏
         */
    }

    /*
        public boolean delete():删除文件或者文件夹
        删除注意事项：
        Java中的删除不走回收站。
        要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
     */
    private static void FileDelete() {
        File file1 = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\a");
        boolean b = file1.delete();
        System.out.println("是否删除成功？：" + b);
    }

    /*
        public boolean renameTo(File dest):把文件重命名为指定的文件路径
        重命名注意事项
        如果路径名相同，就是改名。
        如果路径名不同，就是改名并剪切。
     */
    private static void FileRename() {
        File file1 = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\a\\a.txt");
        File file2 = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\b\\b1\\b.txt");
        boolean b2 = file1.renameTo(file2);
        System.out.println("改名是否成功？：" + b2);
    }


    /*
        public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
        public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
        public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
        注意事项：如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
     */
    private static void FileCreat() {
        File file1 = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\a\\a.txt");
        try {
            boolean b1 = file1.createNewFile();
            System.out.println("创建文件是否成功？：" + b1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\a");
        boolean b2 = file2.mkdir();
        System.out.println("创建文件夹是否成功？：" + b2);

        File file3 = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\b\\b1");
        boolean b3 = file3.mkdirs();
        System.out.println("创建文件夹是否成功？：" + b3);
    }


    /*
    File(String pathname)：根据一个路径得到File对象
    File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
    File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对
 */
    private static void FileConstructor() {
        String pathname1 = "D:\\Java\\workplace\\JavaLearning\\src\\Java14_file\\a.txt";
        String pathname2 = "D:\\Java\\workplace\\JavaLearning\\src\\Java14_file";

        File file1 = new File(pathname2);
        System.out.println("file1:" + file1);

        File file2 = new File("D:\\Java\\workplace\\JavaLearning\\src\\Java14_file","a.txt");
        System.out.println("file2:" + file2);

        File file3 = new File(file1,"a.txt");
        System.out.println("file3:" + file3);
    }
}
