#include<iostream>
using namespace std;
int main(){
    string x;
    cin>>x;
    cout<<"Enter the input string";
    int len=x.length();
    int res=0;
    for(int i=0;i<len;i++){
        char a=x[i];
        int h=int(a);
        res=res+h;
    } cout<<res;
    
}
