package chandraapplication;

public class array {
	public static void main(String[] args) {
		int[] arr = {10,20,30,23,45,56};
		for(int i =0 ; i<arr.length;i++) {
			for(int j =0 ;j<arr.length;j++) {
				if(arr[j]<arr[j+1]) {
					j++;
				}else {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					System.out.println(j);
				}
				
			}
		}
		
		
	}

}
