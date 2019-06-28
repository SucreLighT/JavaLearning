package finalDemo;

/**
 * final修饰局部变量
 * 1.修饰基本数据类型时，其值不能改变；
 * 2.修饰引用类型，地址不可改变，其中值可以改变；
 * 3.修饰引用类型不可以再New
 */
public class Demo02 {
    public static void main(String[] args) {
        final int a = 10;
        //a = 11;   // 报错

        final Cat cat = new Cat("小花", 4);
//        cat = new Cat("小黑",5);  //报错
        cat.say();
    }
}


class Cat {
    String name;
    int legs;

    public Cat(String name, int legs) {
        super();
        this.name = name;
        this.legs = legs;
    }

    public void say() {
        System.out.println("I'm" + name + ",have " + legs + " legs.");
    }
}