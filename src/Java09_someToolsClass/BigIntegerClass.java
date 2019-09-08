package Java09_someToolsClass;

import java.math.BigInteger;

/**
 * @author sucre
 * @date 2019-07-25
 * @time 14:34
 * @description 常用的工具类-BigInteger类
 */

/*
    BigInteger类
    当运算时，超过最大的int值时，可以用BigIntger来做加减乘除运算
    BigInteger的方法
    *add 加法
    *substract 减法
    *multiply 乘法
    *divide 除方法
    *divideAndRemainder  除和余数
 */

public class BigIntegerClass {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;  //2^31-1=214748367
        int b = Integer.MAX_VALUE;
        System.out.println(a+b);    //结果溢出

        BigInteger bi1 = new BigInteger("214748367");
        BigInteger bi2 = new BigInteger("214748367");

        BigInteger sum = bi1.add(bi2);
        System.out.println(sum);

        BigInteger sub = bi1.subtract(bi2);
        System.out.println(sub);

        BigInteger mul = bi1.multiply(bi2);
        System.out.println(mul);

        BigInteger div = bi1.divide(bi2);
        System.out.println(div);

        BigInteger[] div1 = bi1.divideAndRemainder(bi2);
        System.out.println(div1[0]);    //得1
        System.out.println(div1[1]);    //余数0

    }
}
