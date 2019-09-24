package Java18_thread;

/**
 * @author sucre
 * @date 2019-09-24
 * @time 08:48
 * @description 线程同步问题
 *
 */

/*
    火车票卖票案例
    上海到北京火车票：今天13：00 ，100张
    火车站有4个窗口在同时卖票，要保证一张票只能被卖一次

    4个线程表示4个窗口
    通过加锁可以解决被多次卖同一张票的问题
    使用同步代码块
 */

/*
    1.锁问题：
    同步中，锁最好同一个对象，如果不是同一对象，还是会有线程安全问题
    锁：this,代表当前对象
    锁：如果 new 对象，就不是同一把锁
    锁：字节码对象 String.class,内存中，只有一个字节码对象
    开发中：一般都是this
    2.在方法内部声明synchronized的就是 “同步代码块”
    3.在声明方法的时候，添加 synchronized，就是同步方法
    》如果是非静态方法，锁就是this
    》如果是静态方法，锁就当前类的字节码对象
    //TicketTask.class
	     public static synchronized void test1(){}

	4.同步使用的建议：
	同步加锁的时候，尽量让锁住的代码范围小一点，这样可以让其它线程等待时间少一点，性能高
 */
public class Demo04 {
    public static void main(String[] args) {
        TicketTask ticketTask = new TicketTask();
        Thread t1 = new Thread(ticketTask);
        t1.setName("窗口A");
        Thread t2 = new Thread(ticketTask);
        t2.setName("窗口B");
        Thread t3 = new Thread(ticketTask);
        t3.setName("窗口C");
        Thread t4 = new Thread(ticketTask);
        t4.setName("窗口D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class TicketTask implements Runnable {

    int ticket = 100;   //定义100张票

    @Override
    public void run() {
        while (true) {
             synchronized (String.class) {
                if (ticket <= 0) {
                    System.out.println("今日票已售光！");
                    break;
                } else {
                    System.out.println(Thread.currentThread() + "您买到了票，票号为：" + ticket);
                    ticket--;
                }
            }
        }
    }
}
