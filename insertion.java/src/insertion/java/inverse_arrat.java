package insertion.java;
import java.util.Scanner;
public class inverse_arrat {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n=sc.nextInt() ;
		int[] arr = new int[n];
		while() {
			for(int idx =1;idx<arr.length;idx++) {
				for(int j = arr.length;j<idx;j--) {
					int temp  = arr[idx];
					arr[idx]= arr[arr.length];
					arr[arr.length]=temp;
					System.out.println(arr.length);
					idx++;
					j--;
				}
				
			}
		}
	}

}
