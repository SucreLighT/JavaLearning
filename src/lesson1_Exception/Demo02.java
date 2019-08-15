package lesson1_Exception;

/**
 * @author sucre
 * @date 2019-08-15
 * @time 09:28
 * @description 自己处理异常
 */

/*
    自己处理异常主要有两种方法
    1.try…catch…finally
    2.throws
 */

public class Demo02 {
    public static void main(String[] args) {
//        算术异常ArithmeticException
        try{
            int a = 10/0;
        }catch (ArithmeticException e){
            System.out.println("算术异常，除数不能为0！");
        }
    }
}
