package Basic05_polymorphic;

/**
 * 多态访问成员方法：
 * 编译看左边(父类) ，运行看右边(子类)
 * 注意：如果是静态方法，则调用方式与调用成员变量的相同
 */

public class Demo02 {
    public static void main(String[] args) {

        //父类引用指向子类对象[左边是父类，右边是子类]
        Father2 son2 = new Son2();
        son2.eat(); //执行Son的eat方法
    }
}

class Father2{

    int num = 10;

    public void eat(){
        System.out.println("吃海鲜...");
    }
}

class Son2 extends Father2{
    int num = 20;

    public void eat(){
        System.out.println("吃野味...");
    }
}