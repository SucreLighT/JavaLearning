package Basic04_finalDemo;


/**
 * final修饰特点：
 * 1.修饰类，类不可被继承；
 * 2.修饰变量，变量就成为常量，只能赋值一次，一把与public static共用；
 * 3.修饰方法，方法不能被重写
 */
public class Demo01 {
    public static void main(String[] args) {

    }
}

class Father{
    public void drive(){
        System.out.println("开车");
    }
}

final class Son extends Father{ //Son类不能被继承
}