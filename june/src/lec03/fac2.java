package lec03;
import java.util.Scanner;
public class fac2 {
	public static void main(String[] args) {
		int num , temp , i = 2;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = num;
		while(temp>1) {
			if(temp % i == 0) {
				System.out.println(i + " ");
				temp = temp / i;
			}
			else {
				i++;
			}
		}
	}

}
