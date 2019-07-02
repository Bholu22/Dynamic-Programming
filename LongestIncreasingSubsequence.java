import java.util.*;
public class LongestIncreasingSubsequence{
	public static void find(int ar[])
	{
		int n=ar.length;
		int l[]=new int[n]; //temporary array to store length of longest increasing subsequence (its largest value element will give the answer)
		int sub[]=new int[n];// temporary array to store index of longest increasing subseqce
		for(int i=0;i<n;i++)
		{
			l[i]=1;      // initialise length array with 1
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++) //traverse j for every i from 0 and upto i
			{
				if(ar[j]<ar[i]){
					if(l[j]+1>=l[i])  
					{
						l[i]=l[j]+1;
					sub[i]=j;     // store value of index of j in 
					}
					
				}
			}
		}
		int max=l[0];
		int kk=0;
		for(int k=1;k<n;k++)     // calculate maximum in length array
		{
			if(l[k]>max){
				max=l[k];
				kk=k;
			}
		}
		System.out.println(" LONGEST INCREASING SUBSEQUENCE OF LENGTH    "+max);
		int res[]=new int[n];
		res[n-1]=ar[kk]; 
		int ll=n-2;
		while(kk>0)
		{
			int x=sub[kk];
			//int y=sub[x];
			//System.out.print(x+ "           "+ar[x] + "    "+ll);
		     res[ll]=ar[x];
			 //System.out.println("           "+res[ll]);
			 kk=x;
			 ll--;
			 
		}
		System.out.println("LONGEST INCREASING SUBSEQUENCE IS :");
		for(int m=ll+1;m<n;m++)
		{
			System.out.print(res[m]+" ");
		}
		
	
		
	}
	public static void main(String...args)
	{
		int ar[]={0,4,12,2,10,6,9,13,3,11,7,15};
		find(ar);
	}
}