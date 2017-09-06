import java.util.*;
class dupp{
public static void main(String args []){
Scanner sc = new Scanner(System.in);
String str=sc.next();
String str1[]=str.split("");
Set<String> ss= new TreeSet<String>();
for(int i=0;i<str.length();i++){
ss.add(str1[i]);}
String str3=ss.toString();
String str4=str3.replace("[","");
String str5=str4.replace("]","");
String str6=str5.replace(",","");
String str7=str6.relace(" ","");
System.out.print(str7);}}
