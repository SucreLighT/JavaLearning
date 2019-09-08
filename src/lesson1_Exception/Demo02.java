package lesson1_Exception;

/**
 * @author sucre
 * @date 2019-08-15
 * @time 09:28
 * @description try-catch-finally处理异常
 */

/*
    自己处理异常主要有两种方法
    1.try…catch…finally
    finally的语句体一般情况下一定会执行
    特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))

    2.throws
 */

/*
    Exception是一个继承Throwable的子类
    getMessage():获取异常信息，返回字符串。
    toString():获取异常类名和异常信息，返回字符串。
    printStackTrace():打印异常类名和异常信息，以及异常出现在程序中的位置

 */
public class Demo02 {
    public static void main(String[] args) {
//        算术异常ArithmeticException
        int a = 1;
        try{
            a = 10/0;
        }catch (Exception e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println("算术异常，除数不能为0！");
        }finally {
            System.out.println("程序继续进行");
            System.out.println("a:"+a);
        }
    }
}
