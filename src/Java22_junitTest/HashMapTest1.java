package Java22_junitTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sucre
 * @date 2019-12-03
 * @time 10:37
 * @description
 */
public class HashMapTest1 {
    HashMapDemo hashMapDemo = new HashMapDemo();

    @Before
    public void setUp() throws Exception {
        hashMapDemo.initialize();
    }

    @After
    public void tearDown() throws Exception {
        hashMapDemo.initialize();
    }

    @Test
    /*
     * 测试一：测试HashMap长度
     */
    public void test1(){
        Assert.assertEquals(5,hashMapDemo.getSize());
    }
}
