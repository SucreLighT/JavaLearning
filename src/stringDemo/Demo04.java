package stringDemo;

import java.util.Scanner;

/**
 * 模拟用户登录，一共三次机会，用户名和密码默认为admin
 */

public class Demo04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("您还有" + (3 - i) + "次机会可以登录");

            System.out.println("请输入用户名：");
            String username = scanner.nextLine();

            System.out.println("请输入密码：");
            String password = scanner.nextLine();


            //注意这里将字符常量admin放在前面，而不适用username.equals的形式
            //避免username为空，出现空指针异常的情况
            if ("admin".equals(username) && "admin".equals(password)) {
                System.out.println("登录成功...");
                break;
            } else {
                System.out.println("登录失败，用户名或密码不正确...");
            }
        }
    }
}
