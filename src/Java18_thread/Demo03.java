package Java18_thread;

/**
 * @author sucre
 * @date 2019-09-23
 * @time 14:54
 * @description 线程中常用方法 参看API
 */

public class Demo03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyThread mt = new MyThread();
            if(i == 4){
                mt.setName("大哥原名是：" + mt.getName());    //设置线程名
                mt.setPriority(10); //设置线程优先级，默认优先级是5，最小优先级1，最高优先级10
            }
            mt.start();
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        //currentThread()方法打印的内容为线程名，线程优先级以及线程所属的线程
        System.out.println("子线程：" + Thread.currentThread());
        System.out.println("线程名：" + Thread.currentThread().getName());
    }
}