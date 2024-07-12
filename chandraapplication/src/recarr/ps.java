package recarr;
import java.util.Scanner;
public class ps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n = 0;
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			for(int j=(count+i);j<=1001;j++)
	        {
	            n=(3*j)+2;
	            if(n%n2!=0)
	            {
	              System.out.println(n);
	               break;
	            }
	            else
	            count++;
	        }
		}
		return;
		
	}

}
