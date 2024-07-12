package recurssion;

public class recurssion2 {
public static void main(String[] args) {	
	PI(5);
}
public static void PI(int n ) {
	if(n==0) {
		return;
	}
	//BP = PI(N)
	//SP = PI(N-1)
	System.out.println(n);
	PI(n-1);
	
	
}

}
