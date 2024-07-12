package chandra;
import java.util.Scanner;
public class panil {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  A string");
		String str =sc.nextLine();
		 String n = sc.nextLine();
		Ispanil(n);
	}
	public static boolean Ispanil(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

		
	}
	
}
