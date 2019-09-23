package Java17_io_OtherStream;

import java.io.*;

/**
 * @author sucre
 * @date 2019-09-23
 * @time 09:56
 * @description 对象操作流
 */

/*
    对象操作流
    这个类是将一个对象写入文件
    如果使用这个类写入对象，这个对象需要实现Serializable接口
    对象写入文件时，乱码没有关系，取出来正确就行了

 */
public class Demo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GirlFriend gf1 = new GirlFriend("a",170);
        GirlFriend gf2 = new GirlFriend("b",165);

        FileOutputStream fileOutputStream = new FileOutputStream(".\\src\\Java17_io_OtherStream\\gf.data");
        FileInputStream fileInputStream = new FileInputStream(".\\src\\Java17_io_OtherStream\\gf.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        objectOutputStream.writeObject(gf1);
        objectOutputStream.writeObject(gf2);

        System.out.println("文件写入成功！");

        GirlFriend GF1 = (GirlFriend) objectInputStream.readObject();
        System.out.println(GF1);
        GirlFriend GF2 = (GirlFriend) objectInputStream.readObject();
        System.out.println(GF2);

        objectOutputStream.close();
        objectInputStream.close();
    }
}

class GirlFriend implements Serializable{
    String name;
    double height;

    public GirlFriend(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}