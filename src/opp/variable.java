package opp;

public class variable {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三";
        s.speak();
    }
}

class Student{
    String name;

    public void speak(){
        String name = "李四"; // 局部变量可以和成员变量重名，此时变量访问遵循就近原则
        System.out.println("我的名字是：" + name);
    }
}