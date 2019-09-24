package Java18_thread;

/**
 * @author sucre
 * @date 2019-09-24
 * @time 10:18
 * @description 线程通信
 */

/*
    如果希望线程等待, 就调用wait()
    如果希望唤醒等待的线程, 就调用notify();
    notify是随机唤醒一个线程,notifyAll是唤醒所有线程

    这两个方法必须在同步代码中执行, 并且使用同步锁对象来调用
    如果方法中没有同步锁，会有异常IllegalMonitorStateException

 */
public class Demo06 {
    public static void main(String[] args) {
        MyTask task = new MyTask();

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
    }
}

class MyTask{
    // flag = 1,执行任务1,flag = 2，执行任务2
    int flag =1;

    public synchronized void task1() throws InterruptedException {
        if(flag != 1){
            this.wait();
        }
        System.out.println("自动还款");
        flag = 2;
        this.notify();
    }

    public synchronized void task2() throws InterruptedException {
        if (flag != 2){
            this.wait();
        }
        System.out.println("利息结算");

        flag = 1;
        this.notify();
    }
}