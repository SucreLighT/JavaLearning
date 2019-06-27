package opp;

public class Dog extends Mammal {


        @Override
    public void move() {
            super.move(); //super类似于this，用于指向父类的一个对象,该语句表示使用父类中方法
        System.out.println("狗可以跑和走");
    }


    public static void main(String[] args) {

        Animal a = new Animal();
//        Mammal m = new Mammal();
        Dog d = new Dog();
//        System.out.println(m instanceof  Animal);
//        System.out.println(d instanceof Mammal);
//        System.out.println(d instanceof Animal);
        a.move();
        d.move();

        System.out.println(d);  // 直接打印对象的结果是：包名.类名@地址
    }
}
