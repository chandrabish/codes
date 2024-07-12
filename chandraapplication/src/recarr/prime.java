package recarr;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int divisor = 1;
		int numFac = 0;
		while (divisor <= n) {
			int rem = n % divisor;
			if (rem == 0) {
				numFac = numFac + 1;
				divisor = divisor + 1;
			}
		}
		System.out.println(numFac);
		if (numFac == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Composite");
		}
		
		
		
	}

}
