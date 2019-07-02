package abstractDemo;

/**
 * 1.抽象类和抽象方法用abstract关键字修饰；
 * 2.抽象类不一定有抽象方法，有抽象方法的类一定是抽象类或接口；
 * 3.抽象类不能实例化，由其子类实例化；
 * 4.抽象类的子类要么是抽象类，要么重写抽象类中所有的方法
 *
 */

public class Demo01 {
    public static void main(String[] args) {
//        Animal animal = new Animal(); 抽象类不能实例化
        Cat cat = new Cat();
        cat.eat();

        Dog dog = new Dog();
        dog.eat();
    }
}

abstract class Animal{
    public abstract void eat();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼...");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("啃骨头...");
    }
}


