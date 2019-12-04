package Java22_junitTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sucre
 * @date 2019-12-03
 * @time 11:24
 * @description
 */
public class HashMapTest2 {
    HashMapDemo hashMapDemo = new HashMapDemo();

    @Before
    public void setUp() throws Exception {
        hashMapDemo.initialize();
    }

    @After
    public void tearDown() throws Exception {
        hashMapDemo.clear();
    }

    @Test
    /*
     * 测试二：测试HashMap中是否包含指定键或值
     */
    public void test2(){
        /*
        public static void assertTrue(boolean condition)
        Asserts that a condition is true. If it isn't it throws an AssertionError without a message.
         */

//        Assert.assertTrue(hashMapDemo.hasValue("李四"));
        Assert.assertEquals(true,hashMapDemo.hasValue("李四"));
    }
}
