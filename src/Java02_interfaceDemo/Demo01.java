package Java02_interfaceDemo;

/**
 * 1.类与接口
 * 实现关系，可以单实现，也可以多实现
 * 并且一个类还可以在继承一个类的同时实现多个接口
 *
 * 2.接口与接口
 * 继承关系，可以单继承，也可以多继承
 */
public class Demo01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.say();
    }
}

interface AnimalInterface {
    //接口中的方法都是抽象方法，要在子类中全部重写
    public void eat();
    public void say();
}

class Cat implements AnimalInterface {
    @Override
    public void eat() {
        System.out.println("吃鱼...");
    }

    @Override
    public void say() {
        System.out.println("小花...");
    }
}