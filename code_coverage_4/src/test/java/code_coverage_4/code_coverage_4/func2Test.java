package code_coverage_4.code_coverage_4;

import org.junit.Test;

public class func2Test {
    func2main func2obj = new func2main();

    @Test
    public void T1() {
        String result = func2main.func2(10, 20);
        
        org.junit.Assert.assertEquals("p=20.00, q=1.00", result);
    }

    @Test
    public void T2() {
        String result = func2main.func2(0, 20);
        
        org.junit.Assert.assertEquals("p=0.00, q=Infinity", result);
    }
}