package lec02;
import java.util.Scanner;
public class prime {
	public static void man(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div =1;
		int factor =0;
		while(div<=n) {
			int rem=n%div;
			if(rem==0) {
				factor =factor+1;
				System.out.println("div");
				div++;
				
			}
			if(factor==2) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}
			
		}
	}

}
