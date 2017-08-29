import java.util.*;
class oddeven{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
String str=sc.next();
StringBuffer str1=new StringBuffer(str);
int len=str.length();
char a[]=str.toCharArray();
if((len%2)==0){
str1.reverse();
System.out.print(str1);}
else{
}}
