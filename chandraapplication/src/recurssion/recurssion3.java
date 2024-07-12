package recurssion;

public class recurssion3 {
	public static void main(String[] args) {
		PI(1);
		
	}
	public static void PI(int n ) {
		if(n==-1) {
			return;
		}
		
		//BP = PI(n)
		//SP=PI(n-1)
		System.out.println(n);
		PI(n-1);
	}

}
