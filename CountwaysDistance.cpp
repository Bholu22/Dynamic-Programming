/*Given a distance ‘dist, count total number of ways to cover the distance with 1, 2 and 3 steps.

Examples :

Input:  n = 3
Output: 4
Below are the four ways
 1 step + 1 step + 1 step
 1 step + 2 step
 2 step + 1 step
 3 step

Input:  n = 4
Output: 7
*/
#include<bits/stdc++.h>
using namespace std;
int CountwaysDistance(int dist){
	int count[dist+1];
	count[0]=1,count[1]=1,count[2]=2;
	for(int i=3;i<=dist;i++){
		count[i]=count[i-1]+count[i-2]+count[i-3];
	}
	return count[dist];
}
int main(){
	int n;
	cin>>n;
	cout<<CountwaysDistance(n);
	
	return 0;
}
