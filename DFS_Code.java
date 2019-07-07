import java.util.*;

public class DFS_Code{
	static public void dfs(int adj[][],int n,int s){
		int i,j,k;
		Stack<Integer> st=new Stack<Integer>();
		int visited[]=new int[20];
		visited[s]=1;
		st.push(s);
		
			System.out.println(s);
		
		
		while(!st.isEmpty()){
			k=0;
			i=st.peek();
			for(j=0;j<n;j++){
				if(visited[j]==0 && adj[i][j]==1)
			    {
					st.push(j);
					visited[j]=1;
					k++;
					System.out.println(j);
					break;
				}
				
			}
			if(k==0){
				int x=st.pop();
			}
		}
		
	}
	
	public static void main(String args[]){
		
		int adj[][]={{0,1,1,0,0,0,0},  
				{0,0,0,1,0,0,0},  
				{0,1,0,1,1,1,0},  
				{0,0,0,0,1,0,0},  
				{0,0,0,0,0,0,1},  
				{0,0,0,0,0,0,1},  
	{0,0,0,0,0,0,0}};
		int n=6;
		int s=0;
		dfs(adj,n,s);
	}
}