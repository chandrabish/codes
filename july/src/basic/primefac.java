package basic;

public class primefac {
	public static void main(String[] args) {
		int n =5;
		int row = 1;
		int nsp =0;
		int nst = n;
		while(row<=n) {
			int csp =0 ;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst =0 ;
			while(cst<nst) {
				System.out.print("*");
				cst++;
				

		}
			nst--;
			nsp=nsp+2;
			row++;
			System.out.println();
		
	}
	}
}


