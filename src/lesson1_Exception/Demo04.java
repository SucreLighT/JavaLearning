package lesson1_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author sucre
 * @date 2019-08-15
 * @time 09:54
 * @description 编译时异常和运行时异常
 */

/*
    Java中的异常被分为两大类："编译时异常"和"运行时异常"。
    编译时异常和运行时异常的区别
	  >所有的RuntimeException类及其子类被称为运行时异常
	  >其他的异常就是编译时异常

    编译时异常-Java程序必须显示处理，否则程序就会发生错误，无法通过编译
    运行时异常-无需显示处理，也可以像编译时异常一样处理，比如算术异常，数组越界,空指针都是运行时异常

 */

public class Demo04 {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("a.txt"); //编译时异常
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
