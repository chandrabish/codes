package maxelement;
import java.util.*;
public class maxvalue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		int m = Max[arr];
		System.out.println(m);
		
	}
	public static int Max(int[] arr) {
		int min =Integer.MIN_VALUE;
		for(int element: arr) {
			if(element>min) {
				min=element;
			}
		}
		return min;
	}

}

