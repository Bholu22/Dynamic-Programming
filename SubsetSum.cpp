#include<bits/stdc++.h>
using namespace std;
bool subsetSum(int set[],int n, int sum){
	int t[n+1][sum+1];
	for(int i=0;i<=n;i++){
		t[i][0]=true;
	}
	for(int i=1;i<=sum;i++){
		t[0][i]=false;
	}
	for(int i=1;i<=n;i++){
		for(int j=1;j<=sum;j++){
			if(j<set[i-1])
				t[i][j]=t[i-1][j];
			if(j>=set[i-1])
				t[i][j]=(t[i-1][j]||t[i-1][j-set[i-1]]);	
		}
	}
	return t[n][sum];
	
}
int main(){
	int set[]={2,5,8,6,4};
	int sum=9;
	int n=sizeof(set)/sizeof(set[0]);
	if(subsetSum(set,n,sum)==true){
		cout<<"Found subset with given sum!!!";
		
	}
	else
		cout<<"Doesn't found subset wiht given sum!!";
	
	return 0;
}
