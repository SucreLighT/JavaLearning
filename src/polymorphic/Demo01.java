package polymorphic;

/**
 * Java中存在多态的前提条件
 * 1.要有继承关系
 * 2.要有方法重写
 * 3.要有父类引用指向子类对象
 *
 * 多态中的成员变量访问特点:
 * 编译看左边(父类)，运行看左边(父类)
 *
 * 多态的好处和弊端
 * 好处：方便维护，扩展性好
 * 弊端: 在方法中使用父类当作参数时，方法内部不能使用父类访问子类的属性和方法
 */
public class Demo01 {
    public static void main(String[] args) {

        //使用儿子
        Son son1 = new Son();
        System.out.println(son1.num);

        //父类引用指向子类对象
        Father son2 = new Son();
        System.out.println(son2.num);
    }
}

class Father{
    int num = 10;
}

class Son extends Father{
    int num = 20;
}