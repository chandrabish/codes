package basic;
import java.util.*;
public class challenging {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int D = b * b - 4 * a * c;
		if (D < 0)
			System.out.println("Imaginary");
		else if (D == 0) {
			System.out.println("Real and Equal");
			double root = -1*b/(a*2);
			System.out.print((int)root+" "+(int)root);//even if it has same root you have to print twice
		} else if (D > 0) {
			System.out.println("Real and Distinct");
			double root2 = (-b + Math.sqrt(D)) / (2*a);
			double root1 = (-b - Math.sqrt(D)) / (2*a);
			System.out.print((int)root1 + " " + (int)root2);//you need to typecast your roots to integer
		}

	}

}
