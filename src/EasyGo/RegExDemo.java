package EasyGo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {

        // 在一个给定的字符串中找到数字串


        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // 创建Pattern对象
        Pattern r =Pattern.compile(pattern);

        // 创建Matcher对象
        Matcher m = r.matcher(line);


        //匹配后： (This order was placed for QT300)(0)(! OK?)
        if(m.find()){
            System.out.println("Found value: " + m.group(0));   // 0默认为整个字符串
            System.out.println("Found value: " + m.group(1));   // 第一个括号中内容
            System.out.println("Found value: " + m.group(2));   // 第二个括号中内容
            System.out.println("Found value: " + m.group(3));   // 第三个括号中内容
        }else{
            System.out.println("Not Found!");
        }

    }
}
