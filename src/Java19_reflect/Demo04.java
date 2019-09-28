package Java19_reflect;

import java.lang.reflect.Field;

/**
 * @author sucre
 * @date 2019-09-28
 * @time 13:59
 * @description 通过反射访问成员变量
 */

public class Demo04 {
    public static void main(String[] args) {
        Field[] fields = Person.class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++){
            System.out.println("变量：" + fields[i].getName() + " 类型：" + fields[i].getType());
        }
    }
}
