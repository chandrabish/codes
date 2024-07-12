package lec04;
import java.util.Scanner;
public class mul {
	public static void main(String[] args) {
		int c;
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int i = 1 ; i <= y; i++) {
			c = x * i;
			System.out.println(c);
			y++;
		}
	}

}
