package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class WeakClassTest {
    WeakClass weakObj = new WeakClass();

    @Test
    public void testStatementCoverage() {
        int result = weakObj.weakMethod1(10);
        
        org.junit.Assert.assertEquals(5, result);
    }
    @Test
    public void testBranchCoverage() {
        assertThrows(ArithmeticException.class, () -> {
            weakObj.weakMethod1(0);
        });
    }
}