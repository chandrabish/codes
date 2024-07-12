package lec03;
import java.util.Scanner;
public class fibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
	    int b = 1;
	    int count = 0 ;
	    while(count < n ) {
	    	int c = a + b;
	    	System.out.println(c);
	    	a = b;
	    	b = c;
	    	count++;
	    	
	    }
	   
	}

}
