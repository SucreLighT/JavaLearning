package Java06_stringDemo;

import java.util.Scanner;

/**
 * 字符串反转
 */

public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");

        String str = scanner.nextLine();

        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println("反转：" + str1);

    }
}
