package lesson1_Exception;

import javax.security.auth.login.LoginException;
import java.util.Scanner;

/**
 * @author sucre
 * @date 2019-09-08
 * @time 14:02
 * @description 自定义一个登陆异常
 */

/*
    当用户名和密码不正确时，抛出登陆异常
 */

//方法内throw的异常对象如果是一个运行时异常，方法后面就不会写throws

public class Demo07 {
    public static void main(String[] args) /*throws LoginException*/ {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.nextLine();

        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        if("admin".equals(name) && "123".equals(password)){
            System.out.println("登陆成功！");
        }else {
            throw  new lesson1_Exception.LoginException("用户名或密码不正确！");
        }
    }
}
