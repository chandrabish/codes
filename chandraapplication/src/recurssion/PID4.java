package recurssion;

public class PID4 {
	public static void main(String[] args) {
		PID(1,5);
	}
	public static void PID( int s, int e) {
		if(s>e) {
			return;
		}
		//BP = PID(n)
		//SP = PID(n+1)
		System.out.println(s);
		PID(s+1,e);
		System.out.println(e);
	}
	

}
