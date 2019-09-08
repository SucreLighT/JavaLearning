package lesson1_Exception;

/**
 * @author sucre
 * @date 2019-08-15
 * @time 09:40
 * @description java异常处理 try catch 捕获多个异常
 */

/*
    try-catch捕获多个异常
    注意事项：
    catch中父类的Exception只能放在最后面
    catch一个原则，先由子类处理异常，子类不能处理异常，再由父类处理
 */
public class Demo03 {
    public static void main(String[] args) {
        try{
            int arr[] = {1,2,3};
//            System.out.println(arr[3]);

//            int a = 10/0;

            arr = null;
            System.out.println(arr[0]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常！");
        }catch (ArithmeticException e){
            System.out.println("算术异常！");
        }catch (Exception e){
            System.out.println("其他异常！");
        }

        System.out.println("......");
    }
}
