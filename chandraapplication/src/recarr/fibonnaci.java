package recarr;

public class fibonnaci {
	public static void main(String[] args) {
		System.out.println(fib(4));
	}
	public static int fib(int n) {
		if(n<=1) {
			return 1;
		}
		//BP = fib(n);
		//SP = fib(n-1) fib(n-2);
		int sp1 = fib(n-1);
		int sp2 = fib(n-2);
		return sp1+sp2;
		
	}
	

}
