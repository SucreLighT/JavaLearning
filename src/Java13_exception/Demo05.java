package Java13_exception;

/**
 * @author sucre
 * @date 2019-09-08
 * @time 13:26
 * @description throws方式处理异常
 */

/*
    throws方式处理异常时，
    可以使用try-catch捕获异常
    或者在上一级使用throws抛出异常

    throws和throw的区别
    throws
    用在方法声明后面，跟的是异常类名
    可以跟多个异常类名，用逗号隔开
    它表示抛出异常，由该方法的调用者来处理
    throw
    用在方法体内，跟的是异常对象名
    只能抛出一个异常对象名，表示抛出异常

 */
public class Demo05 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.setAge(-18);
//        try {
//            p.setAge(-18);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        p.say();
    }
}

class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age>=1 && age<=150){
            this.age = age;
        }else {
            throw new Exception("你来自火星");
        }
    }

    public void say() {
        System.out.println("今年" + age +"岁！");
    }
}
