import java.util.*;
class primer{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int x=sc.nextInt();
  int b=sc.nextInt();
int count=0;
System.out.print("2 3 ");
for(int i=x;i<=b;i++){
int n=i/2;
for(int j=2;j<n;j++){
if(i!=j){
if(i%j==0){
count++;
}}}if(count==0){
System.out.print(i+" ");}}}}
