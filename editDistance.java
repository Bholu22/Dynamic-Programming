import java.util.*;
public class editDistance{
	public static void min(String str1,String str2){
		int n1=str1.length();
		int n2=str2.length();
		int t[][]=new int[n1+1][n2+1];
		for(int i=0;i<=n1;i++){
			for(int j=0;j<=n2;j++){
				if(i==0&&j==0){
					t[i][j]=0;
				}
				else if(i==0){
					t[i][j]=t[i][j-1]+1;
				}
				else if(j==0){
					t[i][j]=t[i-1][j]+1;
				}
				else{
					if(str1.charAt(i-1)==str2.charAt(j-1)){
						t[i][j]=t[i-1][j-1];
					}
					else{
						int x=0;
						if(t[i-1][j-1]>t[i-1][j])
							x=t[i-1][j];
						else
							x=t[i-1][j-1];
						if(x>t[i][j-1])
							x=t[i][j-1];
						t[i][j]=x+1;
					}
				}
			}
		}
		System.out.println(t[n1][n2]);
	}
	public static void main(String...args){
	//	Scanner sc=new Scanner(System.in);
		//String str1=sc.next();
		//String str2=sc.next();
		min("adceg","ab");
		
	}
}