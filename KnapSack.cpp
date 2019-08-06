/*
Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
 In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively.
  Also given an integer W which represents knapsack capacity, 
  find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. 
  You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).
*/
#include<bits/stdc++.h>
using namespace std;
int knapSack(int W,int wt[],int val[],int n){
	int i,w;
	int a[n+1][W+1];
	for(i=0;i<=n;i++){
		for(w=0;w<=W;w++){
			if(i==0||w==0)
				a[i][w]=0;
			else if(wt[i-1]<=w)
				a[i][w]=max((val[i-1]+a[i-1][w-wt[i-1]]),a[i-1][w]);
			else
				a[i][w]=a[i-1][w];		
		}
	}
	return a[n][W];
}
int main(){
    int val[] = {60, 100, 120};  
    int wt[] = {10, 20, 30};  
    int W = 50;  
    int n = sizeof(val)/sizeof(val[0]);  
    cout<<knapSack(W, wt, val, n);  
	return 0;
}
