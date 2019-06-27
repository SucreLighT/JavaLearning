package extendsDemo;

/**
 * super关键字
 * 作用：指向当前类的对象的父类引用
 * 可以调用父类的构造方法、成员变量和成员方法
 * super(args...)表示调用父类的有参构造方法
 */
public class Super {
    public static void main(String[] args) {

        Student stu1 = new Student();
//        stu1.name = "张三";
        stu1.age = 20;
        stu1.say();
    }
}

class Person{
    String name = "张三";
    int age;
}

class Student extends Person{
    String name = "李四";
    public void say(){
        System.out.println("I'm" + name + "," + age + "years old.");// 使用子类的name属性

        System.out.println("I'm" + super.name + "," + age + "years old.");// super使用父类的name属性
    }
}