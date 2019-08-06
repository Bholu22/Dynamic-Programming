/*Minimum cost to reach a point N from 0 with two different operations allowed
Given integers N, P and Q where N denotes the destination position. The task is to move from position 0 to position N with minimum cost possible and print the calculated cost. All valid movements are:

From position X you can go to position X + 1 with a cost of P
Or, you can go to the position 2 * X with a cost of Q
Examples:

Input: N = 1, P = 3, Q = 4
Output: 3
Move from position 0 to 1st position with cost = 3.

Input: N = 9, P = 5, Q = 1
Output: 13
Move from position 0 to 1st position with cost = 5,
then 1st to 2nd with cost = 1,
then 2nd to 4th with cost = 1,
then 4th to 8th with cost = 1,
finally 8th to 9th with cost = 5.
Total cost = 5 + 1 + 1 + 1 + 5 = 13.*/
//Approach
/*
Instead of going from beginning to destination we can start moving from the destination to initial position and keep track of the cost of jumps.

If N is odd then the only valid move that could lead us here is N-1 to N with a cost of P.
If N is even then we calculate cost of going from N to N/2 position with both the moves and take the minimum of them.
When N equals 0, we return our total calculated cost.
*/
#include<bits/stdc++.h>
using namespace std;
int minCost(int n,int p,int q){
	int cost=0;
	while(n>0){
		if(n&1)    //in java if((n&1)>0)
		{
			cost+=p;
			n--;
		}
		else
		{
			int temp=n/2;
			if(temp*p>q)
				cost+=q;
			else
				cost+=temp*p;	
			n/=2;		
		}	
	}
	return cost;
}
int main(){
	int n=9,p=5,q=1;
	int cost=minCost(n,p,q);
	cout<<cost;
	return 0;
}
