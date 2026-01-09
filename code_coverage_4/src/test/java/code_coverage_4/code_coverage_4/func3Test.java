package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class func3Test {
    func3main func3obj = new func3main();
    @Test
    public void T1() {
        // Use assert throws for better error messages in JUnit
        assertThrows(ArithmeticException.class, () -> func3main.func3(10));
    }
    

}
