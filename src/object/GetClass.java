package object;

/**
 * getClass方法返回此对象运行时的类
 */
public class GetClass {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Class clz = dog.getClass();
        System.out.println(clz);
    }
}

abstract class Animal{

}

class Dog extends Animal{

}
