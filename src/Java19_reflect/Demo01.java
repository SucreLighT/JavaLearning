package Java19_reflect;

/**
 * @author sucre
 * @date 2019-09-28
 * @time 09:15
 * @description 反射
 */

/*
    JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
    对于任意一个对象，都能够调用它的任意一个方法和属性；
    这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。

    反射的主要内容
    1.java.lang.Class.java：类对象；
    2.java.lang.reflect.Constructor.java：类的构造器对象；
    3.java.lang.reflect.Method.java：类的方法对象；
    4.java.lang.reflect.Field.java：类的属性对象；
 */

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {

        /*
            获取class文件对象的三种方式
            1.Object类的getClass()方法
            2.类的静态属性class
            3.Class类中静态方法forName()
         */
        Person p1 = new Person("a", 20);
        Class pc1 = p1.getClass();

        Class pc2 = Person.class;

        Class pc3 = Class.forName("Java19_reflect.Person");

    }
}