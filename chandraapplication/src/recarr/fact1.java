package recarr;

public class fact1 { 
		public static void main(String[] args) {
			
	System.out.println(fact1(4));
//			System.out.println(pow(2, 4));
			//System.out.println(Fibo(3));
		}

		public static int fact1(int n) {
			if (n == 0) {
				return 1;
			}
//		BP : Fac(n)
//		SP : Fac(n-1)
			int sp = fact1(n - 1);
			return sp * n;
		}

		public static int pow(int a, int b) {
			if (b == 0) {
				return 1;
			}
			int sp = pow(a, b - 1);
			return sp * a;
		}

}
