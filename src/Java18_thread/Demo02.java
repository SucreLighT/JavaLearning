package Java18_thread;

/**
 * @author sucre
 * @date 2019-09-23
 * @time 14:33
 * @description 线程实现方式一 实现Runnable接口
 */

/*
    实现Runnable接口
    1.定义类实现Runnable接口
    2.实现run方法
    3.把新线程要做的事写在run方法中
    4.创建自定义的Runnable的子类对象,创建Thread对象传入Runnable对象
    5.调用start()开启新线程

    优点：线程类有父类时也可以使用该方法
    缺点：使用时需要先获取到线程对象后才能使用Thread中的方法

 */
public class Demo02 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
//            Mythread mt = new Mythread();
//            Thread th = new Thread(mt);
//            th.start();

            //匿名内部类方式
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("子线程：" + Thread.currentThread());
                    System.out.println("线程名：" + Thread.currentThread().getName());
                }
            }).start();
        }
    }
}

//class Mythread implements  Runnable{
//
//    @Override
//    public void run() {
//        System.out.println("子线程：" + Thread.currentThread());
//        System.out.println("线程名：" + Thread.currentThread().getName());
//    }
//}