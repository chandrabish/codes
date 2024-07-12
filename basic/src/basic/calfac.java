package basic;

public class calfac {
	public static int calculatefac(int n ) {
		if(n==0 || n==1) {
			return 1;
		}
		
		int c = n*calculatefac(n-1);;
		return c;
	}
	public static void main(String[] args) {
		int n = 5;
		 int ans= calculatefac(5);
		 System.out.println(ans);
	
	}
}
