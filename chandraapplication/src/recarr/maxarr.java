package recarr;

public class maxarr {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		print(0,arr);
		System.out.println(arr);
		
		
		
		
	}
	public static int print( int s, int[] arr) {
		if( s==arr.length-1) {
			return arr[s];
		}
		//bp = (0,arr);
		//sp = (1,arr);
		 int sp = print(s+1,arr);
		 
			 return Math.max(arr[s], sp);
		 }
		
	}


