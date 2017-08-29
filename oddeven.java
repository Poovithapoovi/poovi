import java.util.*;
class oddeven{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
String str=sc.next();
StringBuffer str1=new StringBuffer(str);
int len=str.length();
char b=str.charAt(0);
char a[]=str.toCharArray();
String str2;
if((len%2)==0){
str1.reverse();
System.out.print(str1);}
else{
    str1=str1.delete(0,1);
    str2=str1.toString();
    System.out.print(str2+b);
}}}
