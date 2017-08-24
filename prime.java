import java.util.*;
class prime
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
int m=a/2;
for(int i=2;i<=m;i++)
{
if((a%i)==0){
count++;}}
if(count==0)
{
System.out.print("the number is prime");}
else{
System.out.print("the number is not a prime");}}}
