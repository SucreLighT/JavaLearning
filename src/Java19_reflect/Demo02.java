package Java19_reflect;

import java.lang.reflect.Constructor;

/**
 * @author sucre
 * @date 2019-09-28
 * @time 13:38
 * @description 通过反射访问构造方法
 */

public class Demo02 {
    public static void main(String[] args) {
        //1.获取所有的构造方法
        Constructor[] constructors = Person.class.getDeclaredConstructors();

        //2.遍历每个构造方法
        for(int i = 0; i < constructors.length; i++){
            Constructor c = constructors[i];

            Class[] pt = c.getParameterTypes();
            System.out.print(c + "参数类型为：");
            for (int j = 0; j < pt.length; j++){
                System.out.print(" " + pt[j]);
            }
            System.out.println();
        }
    }
}
