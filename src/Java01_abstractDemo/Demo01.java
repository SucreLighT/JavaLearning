package Java01_abstractDemo;

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
        cat.name="小花";
        cat.eat();
        cat.ssy();

        Dog dog = new Dog();
        dog.eat();
    }
}

abstract class Animal{
    String name;
    final int MAX_LEGS = 4;

    //构造方法
    private Animal(){}
    public Animal (String name){
        super();
        this.name = name;
    }

    public abstract void eat();//抽象方法

    //非抽象方法
    public void say(){
        System.out.println("I;m " + name);
    }
    public void sleep(){
        System.out.println("睡觉...");
    }
}

class Cat extends Animal{

    public Cat(){
        super("小黑..");
    }

    public void eat(){
        System.out.println("吃鱼...");
    }

    public void ssy(){
        super.say();
        System.out.println("我很漂亮");
    }
}

class Dog extends Animal{
    public Dog(){
        super("小白..");
    }
    public void eat(){
        System.out.println("啃骨头...");
    }
}


