package code_coverage_4.code_coverage_4;

public class WeakClass {
	
	public  int weakMethod1(int x) {

		int res = 10;
        if (x > 0) {
            x = x + 10;
        }
		// תקלה אם X = 0

        res = 100 / x; 

        return res;  }
	}

	


