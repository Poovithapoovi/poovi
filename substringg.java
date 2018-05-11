#include<iostream>
using namespace std;
int main(){
    string s1,s2;
    cin>>s1;
    cin>>s2;
    int l1=s1.length();
    int l2=s2.length();
    int c=0;
    string ss;
    for(int i=0;i<l1;i++){
        for(int j=0;j<=l1-i;j++){
            ss="\0";
            ss=s1.substr(i,j);
           if(ss==s2){
               c++;
               break;
           }
        }
    } if(c==1){
        cout<<"yes"<<endl;
    } else{
        cout<<"no"<<endl;
    }
}
