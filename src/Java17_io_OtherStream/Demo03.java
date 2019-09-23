package Java17_io_OtherStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author sucre
 * @date 2019-09-23
 * @time 10:24
 * @description Properties类
 */

/*
    Properties:属性，与Map的使用有点类似
    Properties类表示了一个持久的属性集
    Properties可保存在流中或从流中加载,这个类可以读写文件
    属性列表中每个键及其对应值都是一个字符串
    存中文时，会转成Unicode编译存储
 */

public class Demo03 {
    public static void main(String[] args) throws IOException {

        //使用Properties类存储数据并写入文件中
        Properties p1 = new Properties();

        p1.setProperty("name","sucre");
        p1.setProperty("age","20");
        p1.setProperty("height","180");
        //关联文件对象
        //以适合使用load(InputStream)方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
        p1.store(new FileOutputStream(".\\src\\Java17_io_OtherStream\\info.properties"),null);


        //使用Properties类读取文件中数据
        Properties p2 = new Properties();
        //关联文件 从输入流中读取属性列表（键和元素对）
        p2.load(new FileInputStream(".\\src\\Java17_io_OtherStream\\info.properties"));
        Set<Object> keys = p2.keySet();
        for (Object key:keys
             ) {
            System.out.println(key + "=" + p2.get(key));
        }
    }
}
