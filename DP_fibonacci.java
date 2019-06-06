public class DP_fibonacci{
	static int returnvalue(int n){
		int f[]=new int[n];
		f[0]=1;
		f[1]=1;
		for(int i=2;i<n;i++){
			f[i]=f[i-1]+f[i-2];
		}
		return f[n-1];
	}
	public static void main(String args[]){
		int n=8;
		System.out.println(returnvalue(n));
	}
}