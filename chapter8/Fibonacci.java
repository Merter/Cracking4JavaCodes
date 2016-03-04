

public class Fibonacci {

	public int getFibonacciNumber(int n) {
		if (n <= 0)
			return 0;
			
		if (n <= 2)
			return 1;
			
		return getFibonacciNumber(n-2) + getFibonacciNumber(n-1);
	}
	
	public int getFibonacciNumberIteratively(int n) {
		if (n <= 0)
			return 0;
			
		if (n <= 2)
			return 1;
			
		int onePrev = 1;
		int twoPrev = 1;
		int result = 0;
		for (int i=3; i<=n; i++) {
			result = onePrev+twoPrev;
			twoPrev = onePrev;
			onePrev = result;
		}
		return result;
	}

}