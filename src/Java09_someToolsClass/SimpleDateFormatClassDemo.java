package Java09_someToolsClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sucre
 * @date 2019-07-25
 * @time 14:49
 * @description 常用的工具类-SimpleDateFormat类
 */

/*
    SimpleDateFormat
>SimpleDateFormat是DateFormat的子类,DateFormat是一个抽象类

>SimpleDateFormat把 Date 转成固定格式的字符串时间
  Date date = new Date();
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  String str = sdf.format(date);

>SimpleDateFormat把 字符串时间 转成 Date
  String str = "2018-02-02 17:00:23";
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   Date date = sdf.parser(str);
 */

public class SimpleDateFormatClassDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年-MM月-dd日 星期F HH:mm:ss");
        System.out.println("24小时制："+simpleDateFormat.format(date));

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年-MM月-dd日 星期F hh:mm:ss a");
        System.out.println("12小时制："+simpleDateFormat1.format(date));

        String string = "2019年-07月-25日 星期4 15:00:12";
        Date date1 = simpleDateFormat.parse(string);
        System.out.println(date1);
    }
}
