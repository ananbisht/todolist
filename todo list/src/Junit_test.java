import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import org.junit.jupiter.api.Test;


class TestCase{

    @Test
    void test() {
//      JUnitCore core = new JUnitCore();
        
        Result result = JUnitCore.runClasses(listo.class);
    
        System.out.println(result.wasSuccessful());
        
        for (Failure fail : result.getFailures()) {
             System.out.println(fail.toString());
          }
        
    }
}