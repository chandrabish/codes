package lec02;

public class recurr3 {
	public static int countPaths(int i , int j  , int m , int n) {
		if(n==i || j == m ) {
			return 0;
		}
		if (i == n-1 && j == m-1) {
			return 1;
		}
		int dounPaths = countPaths(i+1, j, m ,n);
		int rightPaths = countPaths(i , j+1 , m,n);
		return dounPaths+rightPaths;
	}
	public static void main(String[] args) {
		int  n =3;
		int  m = 3;
		int c = countPaths(0,0,m,n);
		System.out.println(c);
	}
	
}
