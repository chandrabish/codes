package basic;
import java.util.Scanner;
public class hr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int item = sc.nextInt();
		countDigits( n , item);
		
		
	}
	public static int countDigits(int n, int item){

        int cnt = 0;
        while(n != 0){

            int rem = n % 10;

            if(rem == item) cnt++;
            n = n/10;
            

        }

        return cnt;
    }


}
