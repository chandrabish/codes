package insertion.java;

public class arraymax {
	public static void main(String[] args) {
		int[] arr = {12,23,12,34};
		public static int max(int[] arr) {
			int jeb= Integer.MIN_VALUE;
			for(int aam:arr) {
				if(jeb>aam)
					jeb = aam;
			}
		}
		return jeb;
	
	}
	

}
