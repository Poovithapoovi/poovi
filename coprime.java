#include<iostream>
using namespace std;
int main(){
    int x,y,c=0;
    cin>>x;
    cin>>y;
    for(int i=2;i<=x;i++){
       if((x%i)==0){
           if((y%i)==0){
               c++;
               break;
           }
       } 
    } if(c==0){
        cout<<"yes"<<endl;
    }else{
        cout<<"no"<<endl;
    }
}
