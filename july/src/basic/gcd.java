package basic;

public class gcd {
	public static void main(String[] args) {
		int a =18;
		int b = 34;
		int divisor = a;
		int dividend = b;
		while(divisor>0) {
		int remainder = b%a;
		
		dividend = divisor;
		divisor = remainder;
		
		}
		System.out.print(dividend);
	}

}
