package Java20_enum;

/**
 * @author sucre
 * @date 2019-09-28
 * @time 10:26
 * @description 枚举
 */

/*
    枚举
    1.Java中enum通过声明的类称为枚举类
    2.枚举注意事项
	定义枚举类要用关键字enum
	所有枚举类都是Enum的子类
    枚举类的第一行上必须是枚举项，使用逗号隔开
	枚举类可以有构造函数，但必须是private，默认是private
	枚举类也可以有抽象方法，但是枚举项中必须重写该方法
 */
enum Season{
    SPRING("春天"){
        public void test(){//重写抽象方法
        }
    },
    SUMMER("夏天"){
        public void test(){
            System.out.println("夏天");
        }
    },
    AUTUMN("秋天"){
        public void test(){
        }
    },
    WINTER("冬天"){
        public void test(){
        }
    };

    private String s;
    private Season(String s) {  //构造方法，默认为private
        this.s = s;
    }
    public abstract void test();    //抽象方法，在每个枚举项中要重写
}

/*
    int ordinal() 枚举项都有索引，从0开始
    int compareTo(E o) 索引值比较，返回索引的差值
    String name() 返回枚举项名称
    String toString() 与name方法相同
    values()遍历枚举类的所有枚举值
 */
public class Demo01 {
    public static void main(String[] args) {
        Season s1 = Season.SPRING;
        Season s2 = Season.WINTER;
        System.out.println("s1:" + s1.ordinal());
        System.out.println("s2:" + s2.ordinal());

        System.out.println(s1.compareTo(s2));

        System.out.println("s1 name:" + s1.name());
//        System.out.println("s1:" + s1.toString());

        System.out.println("枚举的遍历");
        Season[] seasons = Season.values();
        for(Season s : seasons){
            System.out.println(s);
        }
    }
}
