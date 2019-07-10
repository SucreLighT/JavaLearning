package scannerDemo;

import java.util.Scanner;

/**
 * hasNext()判断是否还有下个输入项
 * next()用于获取下一个输入项
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(sc.next());
        }
        System.out.println("end...");
    }
}


