package Java13_exception;

/**
 * @author sucre
 * @date 2019-09-08
 * @time 13:52
 * @description try-catch-finally 中关于return的问题
 */

/*
    如果catch里面有return语句，finally的代码还会执行，在return之前执行
 */

public class Demo06 {
    public static void main(String[] args) {
        int r = getDiv(10,0);
        System.out.println("r=" + r);
    }

//    返回a/b的值
    public static int getDiv(int a, int b){
        int i = 0;
        try {
            i = a/b;
            return i;
        }catch (ArithmeticException e){
            System.out.println("算术异常！");
            i = -1;
            return i;
        }finally {
            System.out.println("finally 代码执行....");
        }
    }
}
