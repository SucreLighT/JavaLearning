package interfaceDemo;

/**
 * 抽象类与接口的综合实例
 */
public class Demo02 {
    public static void main(String[] args) {
//        Animal cat = new Cat1(); 如果一个类继承了接口，不要使用抽象类多态实例化对象
        Cat1 cat1 = new Cat1();
        cat1.name = "小花";
        cat1.age = 1;
        cat1.eat();
        cat1.sleep();
        cat1.jump();

        System.out.println("=============");

        Animal dog = new Dog();
        dog.name = "小黑";
        dog.age = 3;
        dog.eat();
        dog.sleep();
    }
}

abstract class Animal{
    String name;
    int age;

    public abstract void eat();
    public abstract void sleep();
}

class Cat1 extends Animal implements JumpInterface{
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    @Override
    public void sleep() {
        System.out.println("猫躺着睡...");
    }

    @Override
    public void jump() {
        System.out.println("猫跳高...");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗啃骨头...");
    }

    @Override
    public void sleep() {
        System.out.println("狗趴着睡...");
    }
}

interface JumpInterface{
    public  void jump();
}
