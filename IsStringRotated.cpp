/*
Author:  Ajeet Kumar
         13/02/2018
Problem: Given two strings, the task is to find if a string can be obtained by rotating another string two places.   
*/
#include <iostream>
using namespace std;
int isRotated(string a,string b){
    if(a.length()!=b.length()) return 0;
    int l=a.length();
    if(a[l-2]==b[0]&&a[l-1]==b[1]) return 1;
    if(b[l-2]==a[0]&&b[l-1]==a[1]) return 1;
    return 0;
}
int main() {
    int t;
    cin>>t;
    while(t--){
    string a,b;
    cin>>a>>b;
    cout<<isRotated(a,b);
    cout<<endl;
    }
	return 0;
}
