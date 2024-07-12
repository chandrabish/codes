package chandra;
import java.util.*;
public class oddeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solve(n);
	}
	public static void solve(int n) {
		if(n==0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
		}
		solve(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
	}

}
