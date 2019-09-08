package Java03_interClass;

/**
 * 1.局部内部类，在方法中的类；
 * 2.在访问他所在方法中的局部变量时必须用final修饰
 * 3.jdk1.8，不加final代码不会报错，jdk1.7以下的版本不写final会报错
 * */
public class Demo02 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.test1();
    }
}

class Outer1{
    public void test1(){
        final int a = 10;   //局部变量，使用final进行修饰
        class Inner{        //局部内部类
            public void test2(){
                System.out.println(a);
            }
        }
        Inner inner = new Inner();
        inner.test2();
    }
}
