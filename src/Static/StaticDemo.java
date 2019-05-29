package Static;

public class StaticDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //通过这个案例，掌握static的实际应用

        /*	制作一个工具类ArrayTool
		1.获取最大值
		2.数组的遍历
		3.数组的反转
		*/

        int[] arr = {18, 8, 228, 3, 199};

        //创建对象
        //ArrayTool tool = new ArrayTool();

        //获取最大值
        int max = ArrayTool.getMax(arr);
        System.out.println(max);

        //打印数组
        ArrayTool.print(arr);

        //数组反转
        ArrayTool.reverse(arr);
        ArrayTool.print(arr);

		/*4.如果一个类中所有的方法都是静态的,需要再多做一步:
		私有构造方法,目的是不让其他类创建本类对象*/
        //ArrayTool tool = new ArrayTool();
    }
}


class ArrayTool {

    //私有构造方法
    private ArrayTool() {

    }

    //1.传一个数组，获取最大值
    public static int getMax(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void print(int[] arr) {
        System.out.println("======数组打印开始=========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("======数组打印完成=========");
    }

    //数组的反转
    public static void reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int left = i;
            int right = arr.length - i - 1;

            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}
