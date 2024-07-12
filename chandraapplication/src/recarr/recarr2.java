package recarr;
import java.util.*;
public class recarr2 {
	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		 for(int i=1;i<nums.length;i++){
	            nums[i]=nums[i-1]+nums[i];

	        }
	        return nums;
		}

}
