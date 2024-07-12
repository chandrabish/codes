package lec02;
import java.util.Scanner;
public class sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int count = 0;
		int sum =0;
		while(count<4){
			System.out.println(count);
			count++;
			sum = sum+count;
		}
		System.out.println(sum);
		
		
	}

}
