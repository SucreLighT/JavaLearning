package extendsDemo;

public class Demo02 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
	/*	继承中构造方法的关系【掌握】
		1.子类中所有的构造方法默认都会访问父类中空参数的构造方法
		为什么:
			因为子类会继承父类中的数据，可能还会使用父类的数据。
			所以，子类初始化之前，一定要先完成父类数据的初始化。

		2.每一个构造方法的第一条语句默认都是：super()
		Constructor call must be the first statement in a constructor

		3.Object类是最顶层的父类。
		  class Person extends Object
		  class Person
		  上面两行代码效果是一样
*/
        //1.使用子类
        //Student stu1 = new Student();
        Student1 stu2 = new Student1("小李", 40);
        stu2.useMoney();//学生用钱
    }
}

class Person1 extends Object {
    int money;

    public Person1() {
        super();
        money = 10000;
        System.out.println("父类Person1的无参构造方法");
    }
}

class Student1 extends Person1 {
    String name;
    int age;

    //如果一个类里面不写任何的构造方法，系统会提供一个无参的构造方法
    public Student1() {
        super();//调用父类无参的构造方法，super你不写，系统默认也会给你加上去
        System.out.println("子类 Student1的无参构造方法..");

    }

    public Student1(String name, int age) {
        super();
        this.name = name;
        this.age = age;

    }

	/*public Student(String name,int age){
		super();//默认情况会调用父类的无参构造方法
		System.out.println("子类有参的构造方法");
	}*/

    public void useMoney() {
        System.out.println("用钱：" + money);
    }

}
