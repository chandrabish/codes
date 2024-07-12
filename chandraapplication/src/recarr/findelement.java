package recarr;
import java.util.*;
public class findelement {
	public int main (String s) {
		
		 int[] ans = calculate(s.toCharArray(), 0);
	        return ans[0];
	    }
	    
	    public int[] calculate(char[] arr, int i) {        
	        int curr = 0;
	        int res = 0;
	        char prevOp = '+';
	        
	        for(;i<arr.length && arr[i]!=')'; i++){  
	            if(Character.isDigit(arr[i]))
	                curr = curr*10 + (arr[i]-'0');
	            else if(arr[i] == '('){
	                int[] ans = calculate(arr, i+1);
	                curr = ans[0];
	                i = ans[1];
	            } 
	            if(i<arr.length && ((!Character.isDigit(arr[i]) && !Character.isWhitespace(arr[i])) || (i == arr.length - 1 || arr[i+1] ==')'))){
	                if(prevOp == '+'){
	                    res += curr;
	                }else{
	                    res -= curr;
	                }
	                prevOp = arr[i];
	                curr = 0;
	            }
	        }
	        return new int[] {res, i}; 

	}

}
