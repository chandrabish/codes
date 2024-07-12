package chandraapplication;
import java.util.Scanner;
public class arrayinverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		for( int l =0;l<arr.length-1;l++) {
			for(int r =arr.length-1;r>l;r++) {
				int temp=arr[r] ;
				
				 arr[r]=arr[l];
				 arr[l]=temp;
				 
				
				System.out.println(arr[r]);
			}
		}
	}

}
