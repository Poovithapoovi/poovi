import java.util.*;
class armstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=a;
int r,sum=0;
while(a>0){
r=a%10;
a=a/10;
sum=sum+(r*r*r);}
if((sum-b)==0)
System.out.print("it is armstrong number");
else
System.out.print("it is not a armstrong number");}}
