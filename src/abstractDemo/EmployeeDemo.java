package abstractDemo;

/**
 * 使用抽象类练习员工的案例
 * 	假如我们在开发一个系统时需要对 “程序员类” 进行设计
 * 	程序员包括3个属性:姓名，工号以及工资
 * 	项目经理，除了含有程序员的属性外，另外还有一个奖金属性
 * 	请使用继承的思想设计出程序员和经理类，要求类中提供必要的方法进行属性访问
 */


public class EmployeeDemo {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("张三","0001",10000.0);
        programmer.say();

        System.out.println();

        ProjectManager projectManager = new ProjectManager("李四","0002",20000,30000);
        projectManager.say();
    }
}

abstract class Employee{
    String name;
    String ID;
    double salary;

    //构造方法
    public Employee(){
        super();
    }
    public Employee(String name, String ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    //抽象方法
    public abstract void say();
}

class Programmer extends Employee{
    //构造方法
    public Programmer(String name, String ID, double salary) {
        super(name, ID, salary);
    }

    //重写抽象方法

    public Programmer() {
        super();
    }

    public void say(){
        System.out.println("我是" + name);
        System.out.println("我的工号是" + ID);
        System.out.println("我的月薪是" + salary);
    }
}

class ProjectManager extends Employee{
    double bonus;

    public ProjectManager() {
        super();
    }

    public ProjectManager(String name, String ID, double salary,double bonus) {
        super(name, ID, salary);
        this.bonus = bonus;
    }

    @Override
    public void say() {
        System.out.println("我是" + name);
        System.out.println("我的工号是" + ID);
        System.out.println("我的月薪是" + salary);
        System.out.println("我的奖金是" + bonus);
    }
}
