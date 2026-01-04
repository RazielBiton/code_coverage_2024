package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class func1_stab {
    Func1_class func1obj = new Func1_class();

    @Test
    public void T2() {
        String result = func1obj.func1(2, 10);
        // Use assertEquals for better error messages in JUnit
        org.junit.Assert.assertEquals("BIG", result);
    }
    
    @Test
    public void T1() {
        // Standard Java uses ArithmeticException for / by zero
        assertThrows(ArithmeticException.class, () -> {
            func1obj.func1(0, 2);
        });
    }
    

}
