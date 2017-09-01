import java.util.*;
class posarray{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++){
b[i]=sc.nextInt();}
for(int i=0;i<a;i++){
for(int j=0;j<a;j++){
if(i!=j){
if((b[i]+b[j]==0)||(b[i]+b[j]==-1)||(b[i]+b[j]==1)){
System.out.println(b[i]+","+b[j]);}}}}}}
