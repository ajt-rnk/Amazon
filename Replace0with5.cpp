/*
Author:  Ajeet Kumar
         13/02/2018
Problem: Replace all zeros in the number with 5 and returns the number.
*/
int convertFive(int n)
{
int result=0,i=0;
while(n!=0){
    int digit=n%10;
    n=n/10;
    if(digit==0){
        digit=5;
    }
    digit=(digit*pow(10,i))+result;
    result=digit;
    i++;
}
return result;
}
