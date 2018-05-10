#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main(){
    cout<<"Enter the number of elements in the array"<<endl;
    int x;
    cin>>x;
    int a[x];
    for(int i=0;i<x;i++){
        cin>>a[i];
    } sort(a,a+x);
    int i=0, j=x-1;
    while(i<j){
        if(i<=(x/2)){
        cout<<a[j--]<<"\t";
        cout<<a[i++]<<"\t";}
    }
}
