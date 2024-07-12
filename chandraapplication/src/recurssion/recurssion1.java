package recurssion;
public class recurssion1{
	public static void main(String[] args) {
		PI(5);
		
	}
	public static void PI(int n ) {
		if(n==0) {
			return;
		}
		
		//BP = PI(n)
		//SP = PI(n-1)
		 PI (n-1);
		 System.out.println(n);
		
	}
}