package EasyGo;
import java.util.*;
import java.text.*;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());


        // 自定义日期时间格式
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date:" + ft.format(dNow));
    }
}
