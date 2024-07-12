package recarr;

public class recarr {
	public static void main(String[] args) { 
	int[] arr= {10,20,30,40,50};
	max(arr,0);
	System.out.println(max(arr,0));
	
	
	
	}
	public static int max(int[] arr, int i) {
	if(i==arr.length) {
		return Integer.MIN_VALUE;
	}
	//bp=print(s,e);
	//sp(s+1,e);
	
	int sp = max(arr,i+1);
	return Math.max(sp,arr[i]);
	}	
	
}
