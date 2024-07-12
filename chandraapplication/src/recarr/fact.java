package recarr;
import java.util.*;
public class  fact{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("*");
		for(int i = 1; i<=(n-3)/2;i++) {
			System.out.print(" ");
			
		}
		for(int i = 1; i<=(n+1)/2;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int row = 1; row<=(n-3)/2;row++) {
			System.out.print("*");
			for(int i= 1; i<=(n-3)/2;i++) {
				System.out.print(" ");
		}
			System.out.println("*");
	}
		for(int i =1;i<=n;i++) {
			System.out.println("*");
		}
		System.out.println();
		for(int row = 1; row<=(n-3)/2;row++) {
			for(int i = 1; i<=(n-3)/2+1;i++) {
				System.out.print(" ");
			}
			System.out.println("*");
			for(int i = 1; i<=(n-3)/2;i++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i = 1; i<=(n+1)/2;i++) {
			System.out.print("*");
		}
		for(int i = 1; i<=(n-3)/2;i++) {
			System.out.println(" ");
		}
		System.out.println("*");
		
			}

}
