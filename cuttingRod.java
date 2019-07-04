import java.util.*;
public class cuttingRod{
	public static void maxprofit(int ar[],int p[],int l)
	{
		int n=ar.length;
		int t[][]=new int[n+1][l+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=l;j++)
			{
			if(i==0 || j==0){
			t[i][j]=0;
			}
			else{
				if(j<i){
					t[i][j]=t[i-1][j];
				}
				else{
					t[i][j]=Math.max(t[i-1][j],(p[i-1]+t[i][j-i]));
				}
			}
			}
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=l;j++)
		
		System.out.print(t[i][j]+"  ");
		System.out.println();
		}
		System.out.println("MAXIMUM PROFIT IS   "+t[n][l]);
		}
	public static void main(String...args)
	{
		int ar[]={1,2,3,4};
		int p[]={2,5,9,6};
		int l=5;
		maxprofit(ar,p,l);
	}
}