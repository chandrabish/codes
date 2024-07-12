package chandra;
import java.util.Scanner;
public class stringreverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		System.out.println(recursivestring (n));
	}
	public static String recursivestring(String n) {
		if(n==null||n.length()<=1) {
			return n;
		}
		   return recursivestring(n.substring(1))+n.charAt(0);
	}
	
}

