package lec02;

public class recurssion5 {
	public static int comeGuest(int n) {
		if(n<=1) {
			return 1;
		
		}
		int c = comeGuest(n-1);
		int s = (n-1)*comeGuest(n-2);
		return c+s;
	}
	public static void main(String[] args) {
		int n =4;		int f=  comeGuest(n);
		System.out.println(f);
	}

}
