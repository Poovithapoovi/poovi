import java.util.*;
class listpalindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++){
b[i]=sc.nextInt();}
String str=Arrays.toString(b);
String str3=str.replace("[","");
String str4=str3.replace("]","");
String str5=str4.replace(",","");
StringBuffer str1=new StringBuffer(str5);
str1.reverse();
String str2=String.valueOf(str1);
if(str5.equals(str2)){
System.out.print("it is a palindrome");}
else{System.out.print("it is not a palindrome");}}}
