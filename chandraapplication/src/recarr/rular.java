package recarr;

public class rular {
	public static void main(String[] args) {
		pat(8);
		
	}
	public static void pat(int n ) {
		if(n==0) {
			return;
		}
		//bp = pat(n);
		//sp = pat(n-1);
		pat(n-1);
		for( int i=0;i<n;i++) {
			System.out.print("-");
		}
		System.out.println();
		pat(n-1);
	}

}
