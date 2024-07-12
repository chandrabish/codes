package basic;
public class cmax {
	int max(int[] arr  ,int  max) {
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]>max) {
				max  = arr[i];
				
			}
	}
	public static void main(String[] args) {
		int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
		max = arr[0];
		int c = max(arr , arr[0]);
		System.out.println(c);
		
		
			
		}
		
		
	}
	
}
	

