import java.util.*;
/*
The poll() method of Queue Interface returns and removes the element at the front the container. 
It deletes the element in the container. The method does not throws an exception when the Queue is empty, it returns null instead.
*/
public class BFS_Code{
	static public void bfs(int adj[][],int n,int s){
		int i,j;
		int visited[]=new int[n];
		
		Queue<Integer> q = new LinkedList<>(); 

		
		visited[s]=1;
		q.add(s);
		while(!q.isEmpty()){
			i=q.remove();
			System.out.println(i);
			for(j=0;j<n;j++){
				if(visited[j]==0 && adj[i][j]==1){
					q.add(j);
				}
			}
		}
		
	}
	
	public static void main(String args[]){
		
		int adj[][]={{0,1,0,0},
						{0,1,1,1},
						{1,0,0,1},
						{0,0,1,0}};
		int n=4;
		int s=2;
		bfs(adj,n,s);
	}
}