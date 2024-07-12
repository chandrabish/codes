package chandra;
import java.util.Scanner;
public class isplain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		System.out.println(ispalindrome(S,0,S.length()-1));
	}
	public static boolean ispalindrome (String S, int i,int j) {
		while (i < j) {
			if (S.charAt(i) != S.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
		
	

}
