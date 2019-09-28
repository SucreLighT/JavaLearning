package Java19_reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author sucre
 * @date 2019-09-28
 * @time 13:49
 * @description 通过反射访问方法
 */


public class Demo03 {
    public static void main(String[] args) {
        Method[] methods = Person.class.getDeclaredMethods();

        for (int i = 0; i < methods.length; i++){
            System.out.println(i + ": " + methods[i]);

            System.out.print("返回值类型:");
            System.out.print(methods[i].getReturnType());

            System.out.print(" ;参数类型:");
            Class[] pt = methods[i].getParameterTypes();
            for (int j = 0; j < pt.length; j++){
                System.out.print(" " + pt[j]);
            }

            int modifier = methods[i].getModifiers();
            String modifier1 = Modifier.toString(modifier);
            System.out.println("修饰符：" + modifier1);
            System.out.println("\n");
        }
    }
}
