package basic;

public class ftoc {
	public static void main(String[] args) {
		int min_F =0;
		int max_F = 100;
		int step =20;
		for(int F = min_F ; F < max_F ; F = F+step) {
			int c = 5 * (F-32) /9;
			System.out.println(F + "/t" + c);
		}
		
	}

}
