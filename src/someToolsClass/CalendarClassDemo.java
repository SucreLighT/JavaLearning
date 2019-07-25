package someToolsClass;

import java.util.Calendar;

/**
 * @author sucre
 * @date 2019-07-25
 * @time 15:06
 * @description 常用的工具类-Calendar类
 */

/*
    Calendar 类
>Calendar是一个日历类
>Calendar也是一个抽象类，用它子类，创建子类对象时，不是用new Calendar
 一般通过Calendar类方法获取
 Calendar calendar = Calendar.getInstance();

>Calendar可以获取年月日时分秒星期的数字
 calendar.get(Calendar.YEAR);

>Calendar的add方法 ： 用于给指定字段添加一个值
 calendar.add(Calendar.YEAR,1);//给年加1

>Calendar.set方法：指定日历的年月日
 calendar.set(2016,2,3)//设置2016年，3月，3号
 */

public class CalendarClassDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("年：" + calendar.get(Calendar.YEAR));
        System.out.println("月：" + (calendar.get(Calendar.MONTH)+1));//月份是从0开始计算的
        System.out.println("日：" + calendar.get(Calendar.DATE));
        System.out.println("==================");
        calendar.add(Calendar.YEAR,-1);
        calendar.add(Calendar.MONTH,1);

        System.out.println("年：" + calendar.get(Calendar.YEAR));
        System.out.println("月：" + (calendar.get(Calendar.MONTH)+1));//月份是从0开始计算的
        System.out.println("日：" + calendar.get(Calendar.DATE));
        System.out.println("==================");

        calendar.set(2020,1,1);
        System.out.println("年：" + calendar.get(Calendar.YEAR));
        System.out.println("月：" + (calendar.get(Calendar.MONTH)+1));//月份是从0开始计算的
        System.out.println("日：" + calendar.get(Calendar.DATE));



    }
}
