package jan01;

public class rec2 {
	public static void sumNum(int n , int i , int sum) {
		if(i==n) {
			sum +=i;
			System.out.println(sum);
			return;
		}
		
		sum += i;
		
		sumNum(i+1, n, sum);
		System.out.println(i);
		
		
	}
	public static void main(String[] args) {
		
		sumNum(1, 9, 0 );
	}

}
