import java.util.*;
class primerc{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int x=sc.nextInt();
int count=0,c=0;
for(int i=4;i<=x;i++){
int n=i/2;
for(int j=2;j<n;j++){
if(i!=j){
if(i%j==0){
count++;}}}if(count==0){
c++;}}
System.out.print(c);}}
