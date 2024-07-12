package insertion.java;

public class insertion {
	public static void main(String[]args) {
		int [] arr = {10,32,21,45,34};
		int flag =0;
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					System.out.println("temp");
					flag =1;
					
				}
				if(flag==0) {
					break;
				}
			}
			
		}
	
	}

}
