package interClass;

/**
 * `1.内部类概述：就是在类内部再声明类
 * 	2.内部类访问特点
 * 	"内部类"可以直接访问"外部类"的成员，包括私有。
 * 	外部类要访问内部类的成员，必须创建对象。
 *``3.内部类对象的创建语法
 * 	外部类名.内部类名 对象名 = 外部类对象.内部类对象;
 */
public class Demo01 {
    public static void main(String[] args) {
        Outer outer = new Outer();//在外部实例化外部类，从而调用内部类方法
        outer.test1();
    }
}

class Outer{
    private int a = 12;

    public void test1(){
        Inner inner = new Inner();  //在外部类中使用内部类
        inner.test();
    }

    private class Inner{    //私有内部类，无法在外部创建内部类对象
        public void test(){
            System.out.println("a:" + a);
        }
    }
}