package Java22_junitTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author sucre
 * @date 2019-12-02
 * @time 09:11
 * @description
 */

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuiteRunner.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
