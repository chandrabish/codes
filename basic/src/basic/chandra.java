package basic;
import java.util.*;
public class chandra {
	public static int calcPower(int x, int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		int c = calcPower(x, n-1);
		int d = x*c;
	}
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		int ans = calcPower(x , n);
		System.out.println(ans);
	}

}
