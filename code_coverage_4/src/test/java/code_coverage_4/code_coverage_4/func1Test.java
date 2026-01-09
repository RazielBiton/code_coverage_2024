package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class func1Test {
    func1main func1obj = new func1main();

    @Test
    public void T1() {
        int result = func1main.func1(1, 0, 10);
        // Use assertEquals for better error messages in JUnit
        org.junit.Assert.assertEquals(1, result);
    }

    @Test
    public void T2() {
        // Use assert throws for better error messages in JUnit
        assertThrows(ArithmeticException.class, () -> func1main.func1(0, 1, 10));
    }
    

}
