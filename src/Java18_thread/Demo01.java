package Java18_thread;

import Java10_collectionDemo.TreeMapDemo;

/**
 * @author sucre
 * @date 2019-09-23
 * @time 11:22
 * @description 线程实现方式一 继承Thread类
 */

/*
    继承Thread类
    1．定义类继承Thread
    2．重写run方法
    3．把新线程要做的事写在run方法中
    4．创建线程对象
    5．使用start()方法开启新线程

    优点：可以直接调用Thread类中的方法，代码简单
    缺点：当线程类已经有父类时不能使用该方法

    start()与run()
    start()方法具有异步执行的效果，run()方法是同步执行的效果。
    使用start()方法，是真的启动了相应的线程0-9，而使用run()方法并没有真的启动线程，而是由一个叫main的主线程去调用的run()方法。
    所以，正确启动线程的方式是使用start()方法。
 */

public class Demo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            //匿名内部类方式
             new Thread(){
                @Override
                public void run() {
                    System.out.println("子线程：" + Thread.currentThread());
                    System.out.println("线程名：" + this.getName());
                }
            }.start();  //.run();
        }
    }
}
