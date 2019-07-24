package packagingClass;

/**
 * @author sucre
 * @date 2019-07-24
 * @time 14:43
 * @description 基本数据类型的包装类
 *  如int对应Integer类
 */


public class Demo {

    Integer i1 = 10;    //自动装箱：把基本数据类型转换为包装类类型
    /*
    相当于： int a = 10; Integer i1 = new Integer(a);
    */

    Integer i2 = new Integer(120);  //自动拆箱：把包装类类型转换为基本数据类型
    int a = i2;

}
