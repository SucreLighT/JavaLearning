package packagingClass;

/**
 * @author sucre
 * @date 2019-07-24
 * @time 14:43
 * @description 基本数据类型的包装类
 *  如int对应Integer类
 */


public class Demo {
    /*Integer i1 = 10;    //自动装箱：把基本数据类型转换为包装类类型
    相当于： int a = 10; Integer i1 = new Integer(a);

    Integer i2 = new Integer(120);  //自动拆箱：把包装类类型转换为基本数据类型
    int a = i2;
*/

    public static void main(String[] args) {
        //看程序写结果
        Integer i1 = new Integer(97);
        Integer i2 = new Integer(97);
        System.out.println(i1 == i2);//false，比较两个对象地址
        System.out.println(i1.equals(i2));//true，比较两个对象的值
        System.out.println("-----------");

        Integer i3 = new Integer(197);
        Integer i4 = new Integer(197);
        System.out.println(i3 == i4);//false
        System.out.println(i3.equals(i4));//true
        System.out.println("-----------");

        Integer i5 = -127;//自动装箱
        Integer i6 = -127;
        /**
         * 自动装箱，如果值一样，范围在-128 ~ 127 【256个数】的地址一样，其它范围地址不一样
         * 因为内部有个Integer的缓冲池
         */

        System.out.println(i5 == i6);//true，地址一样
        System.out.println(i5.equals(i6));//true
        System.out.println("-----------");

        Integer i7 = -129;
        Integer i8 = -129;
        System.out.println(i7 == i8);//false，地址不一样
        System.out.println(i7.equals(i8));//true

    }
}
