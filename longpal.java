import java.util.*;
class longpal{
public static void main(String args[]){
String ss="";
int max=0;
Scanner sc= new Scanner(System.in);
String str=sc.next();
ArrayList<String> al= new ArrayList<String>();
for(int i=0;i<str.length();i++){
for(int j=i+1;j<=str.length();j++){
String s=str.substring(i,j);
StringBuffer s1=new StringBuffer(s);
s1.reverse();
String s2=s1.toString();
if(s.equals(s2)){
if(s.length()>max){
ss=s;
max=s.length();}}}}
System.out.print(ss);}}
