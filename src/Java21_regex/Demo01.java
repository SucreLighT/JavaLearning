package Java21_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sucre
 * @date 2019-09-28
 * @time 10:54
 * @description 正则表达式
 */
/*
    正则表达式两种使用方法
    1.第一种直接使用String类的matches方法与写定的正则表达式进行匹配
    匹配成功返true，失败返回false

    2.第二种使用Pattern类先编译正则表达式
    调用Pattern对象的matcher方法与表达式进行匹配，返回结果为Matcher对象
    Matcher对象分组存储匹配成功的结果
    其中find方法用于查找与该模式匹配的输入序列的下一个子序列
 */
public class Demo01 {
    public static void main(String[] args) {
        /*
        校验qq号码.
		1:要求必须是5-15位数字
		2:0不能开头
		3:必须都是数字
         */
        //1.qq的正则
        String regex1 = "[1-9]\\d{4,14}";
        //2.打印匹配结果
        System.out.println("1030103135".matches(regex1));
        System.out.println("01030103135".matches(regex1));
        System.out.println("1030".matches(regex1));
        System.out.println("1030103135111112".matches(regex1));
        System.out.println("10a30".matches(regex1));



        String s = "我的手机是18988888888,我曾用过18987654321,还用过18812345678";

        //Matcher 的find和group方法

        //1.匹配手机正则表达(11位)
        String regex = "1[3789]\\d{9}";
        //2.创建Pattern
        Pattern p = Pattern.compile(regex);
        //3.创建Matcher
        Matcher m = p.matcher(s);

        //4.找到匹配正则的内容
        System.out.println("手机号：");
        while(m.find()){
            System.out.println(m.group());
        }

    }
}
