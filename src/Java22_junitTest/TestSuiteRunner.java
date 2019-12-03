package Java22_junitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author sucre
 * @date 2019-12-03
 * @time 16:58
 * @description
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HashMapTest1.class,
        HashMapTest2.class,
        HashMapTest3.class
})
public class TestSuiteRunner {
}
