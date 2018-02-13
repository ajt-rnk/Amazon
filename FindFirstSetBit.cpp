/*
Author:  Ajeet Kumar
         13/02/2018
Problem: Given an integer an N, print the position of first set bit found 
from right side in the binary representation of the number.
*/
#include <iostream>
using namespace std;
//Better Option
unsigned int getFirstSetBitPos(int n)
{
   return log2(n&-n)+1;
}
int main() {
	int t;
	cin>>t;
	while(t--){
	    int n,i=0;
	    cin>>n;
	    if(n==0){
	       cout<<i<<endl;
	    }
	    while(n!=0){
	        i++;
	        if(n&1){
	            cout<<i<<endl;
	            break;
	        }
	        n=n>>1;
	    }
	}
	return 0;
}
