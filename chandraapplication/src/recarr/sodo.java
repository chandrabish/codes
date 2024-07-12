package recarr;
import java.util.*;
public class sodo {
	
	public static int bs(int arr[], int x) {
		{
	        int l = 0, r = arr.length - 1;
	        while (l <= r) {
	            int m = l + (r - l) / 2;
	 
	            // Check if x is present at mid
	            if (arr[m] == x)
	                return m;
	 
	            // If x greater, ignore left half
	            if (arr[m] < x)
	                l = m + 1;
	 
	            // If x is smaller, ignore right half
	            else
	                r = m - 1;
	        }
	 
	        // If we reach here, then element was
	        // not present
	        return -1;
	    }
		
	 
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("enetr the elements");
		int  x = sc.nextInt();
		 int result = bs(arr, x);
		if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
		
	
		
		
	}
}
