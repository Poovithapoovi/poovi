import java.util.*;
class sumarr{
public static void main(String args[]){
int count=0,cout=0;
Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++){
b[i]=sc.nextInt();}
for(int i=0;i<a-1;i++){
for(int j=i+1;j<a;j++){
if(b[i]+b[j]>count){
count=b[i]+b[j];}
}}
System.out.print(count);}}
