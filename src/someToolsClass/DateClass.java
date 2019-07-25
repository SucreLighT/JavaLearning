package someToolsClass;

import java.util.Date;

/**
 * @author sucre
 * @date 2019-07-25
 * @time 14:45
 * @description常用的工具类-Date类
 */

/*
    Date类日期类
   getTime(); 返回的自1970-1-1到现在走的毫秒数（时间戳）

 */

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        long time = 1564037266157L;
        Date date1 = new Date(time);
        System.out.println(date1);
    }
}
