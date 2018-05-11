#include<iostream>
using namespace std;
int main(){
    int x;
    cin>>x;
    int a[x];
    for(int i=0;i<x;i++){
        cin>>a[i];
    }
    int h, hh,c=0;
    for(int i=0;i<=x;i++){
        h=0;
        hh=0;
        for(int j=0;j<=(i-1);j++){
            h=h+a[j];
        } for(int k=(i+1);k<x;k++){
            hh=hh+a[k];
        } 
        if(h==hh){
            c++;
            break;
        }
    } if(c==0){
        cout<<"no";
    } else{
        cout<<"yes";
    }
}
