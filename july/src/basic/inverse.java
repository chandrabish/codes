package basic;
import java.util.*;
public class inverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos =0;
		int sum = 0;
		while(n > 0) {
			int digit = n % 10;
			pos++;
			System.out.println(digit + " , " + pos);
			n = n / 10;
			sum = sum+(int)(pos * Math.pow(10 , digit-1));
			
		}
		System.out.println(sum);
	}

}
