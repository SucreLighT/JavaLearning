package Java18_thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sucre
 * @date 2019-09-24
 * @time 10:33
 * @description 互斥锁
 */
/*
    ReentrantLock介绍
    使用ReentrantLock类也可以实现同步加锁
    ReentrantLock叫[互斥锁]，使用lock()和unlock()方法进行同步

    使用ReentrantLock类使用要点
    使用ReentrantLock类的newCondition()方法可以获取Condition对象
    需要等待的时候使用Condition的await()方法, 唤醒的时候用signal()方法
    不同的线程使用不同的Condition, 这样就能区分唤醒的时候找哪个线程了
 */

/*
    实现三个线程的通信

    互斥锁的使用步骤
    1.创建互斥锁对象
    2.创建3个Condition
    3.加锁、解锁
    4.线程等待-Condition的await方法
    5.线程唤醒-Condition的signal方法
 */

public class Demo07 {
    public static void main(String[] args) {
        Task task = new Task();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        task.task1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        task.task2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        task.task3();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}

class  Task{
    ReentrantLock r1 = new ReentrantLock();

    Condition c1 = r1.newCondition();
    Condition c2 = r1.newCondition();
    Condition c3 = r1.newCondition();

    int flag = 1;

    public void task1() throws InterruptedException {
        r1.lock();
        if(flag != 1){
            c1.await();
        }

        System.out.println("任务1");

        flag = 2;
        c2.signal();
        r1.unlock();
    }

    public void task2() throws InterruptedException {
        r1.lock();
        if(flag != 2){
            c2.await();
        }

        System.out.println("任务2");

        flag = 3;
        c3.signal();
        r1.unlock();
    }

    public void task3() throws InterruptedException {
        r1.lock();
        if(flag != 3){
            c3.await();
        }

        System.out.println("任务3");

        flag = 1;
        c1.signal();
        r1.unlock();
    }

}