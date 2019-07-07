public class EggDropping{
	static int max(int a,int b){
		return (a>b)?a:b;
	}
	static void eggDrop(int n,int k){
		int floor[][]=new int[n+1][k+1];
		int i,j,x;
		int res;
		for(i=1;i<=n;i++){
			floor[i][1]=1;
			floor[i][0]=0;
		}
		for(j=1;j<=k;j++){
			floor[1][j]=j;
		}
		for(i=2;i<=n;i++){
			for(j=2;j<=k;j++){
				floor[i][j]=Integer.MAX_VALUE;
				for(x=1;x<=j;x++){
					res=1+max(floor[i-1][x-1],floor[i][j-x]);
					if(res<floor[i][j])
						floor[i][j]=res;
				}
			}
		}
		System.out.println( floor[n][k]);
	}
	public static void main(String args[]){
		int n=2,k=10;
		eggDrop(n,k);
	}
}