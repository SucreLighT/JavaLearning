package Basic03_extendsDemo;

public class Demo03 {

    public static void main(String[] args) {
/*
		继承中构造方法的注意事项
		1.父类没有无参构造方法,子类怎么办?
		  >子类必须创建无参构造方法，内还要调用父类构造方法
		  >子类实现有参的构造方法
		  >父类自己实现无参构造方法
		2.注意事项
		  super(…)或者this(….)必须出现在构造方法的第一条语句上*/

    }
}

/**
 * Person提供了有参构造方法，系统不再提供无参构造方法
 */
class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {//有参构造
        super();
        this.name = name;
        this.age = age;
    }
}

//学生类有一个默认无参构造方法，会默认调用父类的无参构造，而此时父类没有无参构造
class Student2 extends Person2 {

	public Student2(){  //方法1：子类创建有参构造，让其调用父类的有参构造
		//super();      //不调用父类的构造
		super("小王", 20);//调用父类的有参构造方法
	}

	/*public Student2(String name,int age){//方法2：或者实现子类的有参构造，调用父类有参构造
		super(name, age);
	}*/
}
