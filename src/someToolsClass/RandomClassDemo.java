package someToolsClass;

import java.util.Random;

/**
 * @author sucre
 * @date 2019-07-24
 * @time 15:07
 * @description常用的工具类-Random类
 */

/*
    Random类
	此类用于产生随机数
	如果用相同的种子创建两个 Random 实例，则对每个实例进行相同的方法调用序列，它们将生成并返回相同的数字序列。

	public int nextInt()
	public int nextInt(int bound) 指定随机数范围在0-bound之间
 */

public class RandomClassDemo {
    public static void main(String[] args) {
        Random random = new Random(100);
        Random random1 = new Random(100);
        for (int i = 0; i < 5; i++)
        {
            System.out.println(random.nextInt());
            System.out.println(random1.nextInt());
        }

        for (int i = 0; i < 5; i++){
            System.out.println(random.nextInt(10));
            System.out.println(random1.nextInt(10));
        }
    }
}
