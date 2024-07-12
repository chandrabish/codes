package lec02;
import java.util.*;
public class prime {
	public static void main(String[] args) {
System.out.println("enter two number");
Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		for(int i =n1;i<=n2;i++) {
		for(int j = 2;j<i;j++) {
			if(i%j==0) {
				break;
				
			}
			if(i==j) {
				System.out.println(j);
			}
			}
			
		}
		
	}

}
