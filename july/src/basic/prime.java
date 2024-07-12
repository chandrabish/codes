package basic;
import java.util.Scanner;
public class prime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int div = 1;
	int factors = 0;
	while(div<=n) {
		int rem = n % div;
		if(rem==0) {
			factors=factors+1;
		}
		div++;
	}if(factors==2) {
		System.out.println("prime");
	}else {
		System.out.println("not prime");
	}
}
}
