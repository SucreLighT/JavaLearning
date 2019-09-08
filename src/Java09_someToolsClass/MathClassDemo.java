package Java09_someToolsClass;

/**
 * @author sucre
 * @date 2019-07-24
 * @time 15:00
 * @description 常用的工具类-Math类
 */

/*
    1.public static int abs(int a) 取绝对值
	2.public static double ceil(double a) //向上(往大数)取整
	3.public static double floor(double a) // 向下(往小数)取整
	4.public static int max(int a,int b) 取最大值， min方法自学
	5.public static double pow(double a,double b) a^b a的b次方
	6.public static double random() 生成0~0.99999的随机数
	7.public static int round(float a) 四舍五入取整数。
	8.public static double sqrt(double a) 值的正平方根
 */
public class MathClassDemo {
    public static void main(String[] args) {

        System.out.println("-110的绝对值："+Math.abs(-110));
        System.out.println("-3.14向上取整："+Math.ceil(-3.14));
        System.out.println("3.14向下取整："+Math.floor(3.14));
        System.out.println("3.14四舍五入："+Math.round(3.14));

    }

}
