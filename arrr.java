import java.util.*;
class arrr{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
int sum=0,k=0,j=0,l=0;
for(int i=0;i<a;i++){
b[i]=sc.nextInt();}
for(int i=0;i<a-3;i++){
int m=b[i]+b[i+1]+b[i+2];
if(m>sum){
sum=m;
k=b[i];
j=b[i+1];
l=b[i+2];}}
System.out.print(k+" "+j+" "+l+" ");}}
