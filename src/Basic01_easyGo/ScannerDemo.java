package Basic01_easyGo;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("next 方式接收：");

//        判断是否还有输入
        if(s.hasNext())
        {
            String str = s.next();
            System.out.println("输入数据为：" + str);
        }

        if(s.hasNextLine()){
            String str2 = s.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
    }
}
