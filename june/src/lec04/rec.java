package lec04;

public class rec {
	public static void towerOfHanoi(int n , String src, String des, String help ){
		if(n==1) {
			System.out.println("transfer disk" + n + "from" + src + "to" + des);
		}
		towerOfHanoi(n-1 , src , des , help);
		System.out.println("transfer disk" + n + "from" + src + "to" + des);
		towerOfHanoi(n-1 , help , src , des);
	}
	public static void main(String[] args) {
		int n =5;
		towerOfHanoi(n, "S" , "D" , "H");
		
	}

}
