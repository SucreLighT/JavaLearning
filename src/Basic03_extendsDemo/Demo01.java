package Basic03_extendsDemo;

/**
 * 继承的简单实例
 * @author sucre
 *
 * 继承的好处：
 * 提高代码复用性；
 * 提高代码维护性；
 * 继承是多态的前提
 *
 * 继承的弊端：
 * 类的耦合性增加
 */
public class Demo01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color = "小花";
        cat.legs = 4;
        cat.eat();
        cat.sleep();

        Dog dog = new Dog();
        dog.color = "小黑";
        dog.legs = 4;
        dog.eat();
        dog.sleep();
    }
}

//动物类
class Animal {
    String color;
    int legs;

    public void eat() {
        System.out.println("吃饭...");
    }

    public void sleep() {
        System.out.println("睡觉...");
    }
}

class Cat extends Animal {

}

class Dog extends Animal {

}