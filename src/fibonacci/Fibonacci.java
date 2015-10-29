package fibonacci;

public class Fibonacci {
	
	public int fibo(int num) {
		int result;
		if (num == 0)
			return 0;
		if (num == 1)
			return 1;
		result = fibo(num - 1) + fibo(num - 2);
		System.out.println(result);
		return result;
	}

	void myMethod(int counter) {
		if (counter == 0)
			return;
		else {
			System.out.println("" + counter);
			myMethod(--counter);
			return;
		}
	}

	int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		System.out.println(result);
		return result;
	}

	public static void main(String args[]) {
		Fibonacci fib = new Fibonacci();
		// fib.myMethod(6);
		 System.out.println(fib.fibo(4));
		//System.out.println(fib.fact(4));
	}
}
