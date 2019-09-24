package Java18_thread;

/**
 * @author sucre
 * @date 2019-09-24
 * @time 10:08
 * @description 单例模式
 */
/*
    单例模式
    保证类在内存中只有一个对象，即在程序中只能new一次对象

    基本步骤：
    1.申明一个类，类中有一个静态属性，类型与类名相同；
    2.把空参狗杂方法设置为私有；
    3.在类中提供一个公共静态访问方法来返回对象实例。
 */

public class Demo05 {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
    }
}

//写法一
class Singleton1{
    private static Singleton1 instance =  new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance() {
        return instance;
    }
}

//写法二
class Singleton2{
    private static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance() {
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}

//写法三
class Singleton3{
    public static final Singleton3 instance = new Singleton3();
    private Singleton3(){}
}