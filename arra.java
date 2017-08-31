import java.util.*;
class arra{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int a[]=new int [b];
for(int i=0;i<b;i++){
a[i]=sc.nextInt();}
Arrays.sort(a);
String str="\0";
for(int i=b-1;i>=0;i--){
String str1=String.valueOf(a[i]);
str=str+str1;}
System.out.print(str.trim());}}
