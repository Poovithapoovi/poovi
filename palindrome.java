import java.util.*;
class palindrome{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
String str2;
StringBuffer str1=new StringBuffer(str);
str1.reverse();
str2=str1.toString();
if(str.equals(str2)){
System.out.print("it is a palindrome");}
else
{
System.out.print("it is not a palindrome");}}}
