package lec02;

public class recurrsion4 {
	public static int placeTiles(int n , int m) {
		if(n==m) {
			return 2;
			
		}
		if(n<m) {
			return 1;
		}
		int c = placeTiles(n-m,m);
		int d = placeTiles(n-1, m);
		return c+d;
	}
	public static void main(String[] args) {
		int f = placeTiles(5 , 4);
		System.out.println(f);
		
	}

}
