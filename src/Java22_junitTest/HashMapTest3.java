package Java22_junitTest;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sucre
 * @date 2019-12-03
 * @time 11:35
 * @description
 */
public class HashMapTest3 {
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
     * 测试三：测试HashMap中是否存在指定的键值对
     */
    public void test3(){
        Assert.assertThat(hashMapDemo.getHashMap(), Matchers.hasEntry("name","李四"));
    }
}
