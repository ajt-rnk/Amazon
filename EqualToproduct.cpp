/*
Auhtor: Ajeet Kumar
        13/02/2018
Problem: Given an array of integers check whether there are two numbers present with given product.
*/
#include <iostream>
#include <algorithm> 
using namespace std;
int isEqualProduct(int a[],int n,int target){
  int left=0,right=n-1;
  while(left<right){
        int product=a[left]*a[right];
	    if(product==target){
	        return 1;
	    } else if(product<target){
	        left++;
	    } else {
	        right--;
	    }
	 }
   return 0;    
}
int main() {
	int t;
	cin>>t;
	while(t--){
	    int n,target;
	    cin>>n>>target;
	    int a[n];
	    for(int i=0;i<n;i++) cin>>a[i];
	    sort(a,a+n);
	    if(isEqualProduct(a,n,target)){
	        cout<<"Yes\n";
	    } else {
	        cout<<"No\n";
	    }
	}
	return 0;
}
