package recurssion;

public class pd5 {
	public static void main(String[] args) {
		PD(5);
	}
	public static void PD(int n ) {
		if(n==0) {
			return;
		}
		//BP = PD(n)
		//SP = PD(n-1)
		System.out.println(n);
		PD(n-1);
	}

}
