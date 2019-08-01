package generic;

/**
 * @author sucre
 * @date 2019-08-01
 * @time 08:54
 * @description 泛型类和泛型方法
 */



class Stu{
    String name;
    int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/*
    <>中的名字没有要求，一般使用大写字母
    <>中的类型可以有多个，用逗号隔开
 */
class Tool<T>{
    private T o ;

    public T getO() {
        return o;
    }

    public void setO(T o) {
        this.o = o;
    }

    public void print(T t){
        System.out.println(t);
    }

    public T get(int index){
        return null;
    }
}

public class Demo03 {
    public static void main(String[] args) {
        Tool<String> tool = new Tool<String>();
        tool.print("abc");

        Tool<Stu> tool1 = new Tool<Stu>();
        tool1.print(new Stu("李四",20));

    }
}
