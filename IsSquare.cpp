/*
Given coordinate of 4 points.Find if they form a square.
Author: Ajeet Kumar
13/02/2018
*/
#include <iostream>
using namespace std;
float dis(int x1,int y1,int x2,int y2){
    return (abs(x1-x2)*abs(x1-x2)+abs(y1-y2)*abs(y1-y2));
}
int main() {
    int t;
    cin>>t;
    while(t--){
	int x1,x2,x3,x4,y1,y2,y3,y4;
	cin>>x1>>y1>>x2>>y2>>x3>>y3>>x4>>y4;
	float diff2=dis(x1,y1,x2,y2);
	float diff3=dis(x1,y1,x3,y3);
	float diff4=dis(x1,y1,x4,y4);
	bool isSquare=false;
    if(diff3==0||diff2==0||diff4==0){
        isSquare=false;
    }else if(diff2==diff3){
	     float d1=diff2*1.414;
	     float d2=diff3*1.414;
	    if(d1==d2) isSquare=true;
	} else if(diff2==diff4){
	    float d1=diff2*1.414;
	     float d2=diff4*1.414;
	    if(d1==d2) isSquare=true;
	} else if(diff4==diff3){
	    float d1=diff4*1.414;
	     float d2=diff3*1.414;
	    if(d1==d2) isSquare=true;
	}
	if(isSquare){
	    cout<<"Yes\n";
	}else {
	    cout<<"No\n";
	}
    }
	return 0;
}
