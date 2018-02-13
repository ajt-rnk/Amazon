/*
Author:  Ajeet Kumar
         13/02/2018
Problem: For every element in array if there is smaller element on the next immediate position of the array print smaller else -1.
*/
#include <iostream>
#include <stdio.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    int a[n];
	    for(int i=0;i<n;i++){
	        cin>>a[i];
	    }
	    for(int i=0;i<n-1;i++){
	          if(a[i]>a[i+1])
	             cout<<a[i+1]<<" ";
	             else cout<<"-1 ";
	    }
	    cout<<"-1"<<endl;
	}
	return 0;
}
