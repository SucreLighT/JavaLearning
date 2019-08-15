package lesson1_Exception;

/**
 * @author sucre
 * @date 2019-08-15
 * @time 09:40
 * @description java异常处理
 */

/*
    try-catch捕获多个异常
 */
public class Demo03 {
    public static void main(String[] args) {
        try{
            int arr[] = {1,2,3};
            System.out.println(arr[3]);

            int a = 10/0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常！");
        }catch (ArithmeticException e){
            System.out.println("算术异常！");
        }
        System.out.println("......");
    }
}
