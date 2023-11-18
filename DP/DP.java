package DP;
import java.util.Scanner;
public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no.");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ans=countminstepes(n);
		System.out.println(ans);

	}
	public static int countminstepes(int n) {
		int storage[]=new int[n+1];
		storage[1]=0;
		for(int i=2;i<=n;i++) {
			int op1=Integer.MAX_VALUE;
			int op2=Integer.MAX_VALUE;
			int op3=Integer.MAX_VALUE;
			 op1=storage[i-1];
	            if(i%2==0)
	                op2=storage[i/2];
	            if(i%3==0)
	                op3=storage[i/3];
	            storage[i]=1+Math.min(Math.min(op1,op2),op3);
		}
		return storage[n];
	}

}
