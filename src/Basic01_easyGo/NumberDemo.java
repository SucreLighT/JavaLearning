package Basic01_easyGo;

public class NumberDemo {
    public static void main(String []args)
    {
        Integer n = 10;
        System.out.println("float:"+n.floatValue());
        System.out.println("compareTo:"+n.compareTo(10));


        System.out.println("向左取整:" + Math.ceil(10));
        System.out.println("向右取整:" + Math.floor(10));
        System.out.println("最接近整数:" + Math.rint(10.5));//五舍六入
        System.out.println("幂:" + Math.pow(10,2));
        System.out.println("随机数" + Math.random());

    }
}
