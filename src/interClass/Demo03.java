package interClass;

/**
 *  匿名内部类
 * 		1.匿名内部类就是内部类的简化写法。
 * 		2.写匿名内部类前提是:存在一个抽象类或者接口
 * 		3.匿名内部类格式：
 * 		   new 抽象类或者接口名(){ 重写方法; }
 * 		4.匿名内部类本质
 * 		   是一个继承了该类或者实现了该接口的子类匿名对象。
 * 		5.匿名内部类的特点
 * 		   匿名内部类必须实现接口的所有方法
 * 		   匿名内部类必须实现抽象类的所有方法
 * 		6.匿名内部类的方法调用
 * 		   像普通对象一样，调用方法即可
 */
public class Demo03 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Animal cat = new Animal(){//匿名内部类,相当于是抽象类的子类
            @Override
            public void eat() {
                System.out.println("吃鱼...");
            }

            @Override
            public void sleep() {
                System.out.println("趴着睡...");
            }
//        }.eat();可以直接在外部调用方法
        };

        cat.eat();
    }
}

abstract class Animal{
    public abstract void eat();
    public abstract void sleep();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("啃骨头...");
    }

    @Override
    public void sleep() {
        System.out.println("躺着睡...");
    }
}