package code_coverage_4.code_coverage_4;

public class Func1_class {
    int a;
    int b;
    public Func1_class() {
        this.a = 0;
        this.b = 0;
    }
    public String func1(int a, int b) {
        String res = "OK";
    
        if (a != 0 & (b / a) > 2) {
            res = "BIG";
        }
    
        return res;
    }
    
}
