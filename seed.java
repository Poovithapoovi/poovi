import java.util.*;
class seed{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
String str=sc.next();
int sum=Integer.valueOf(str);
String st[]=str.split("");
int hh[]= new int[st.length];
for(int i=0;i<st.length;i++){
hh[i]=Integer.parseInt(st[i]);}

for(int i=0;i<st.length;i++){
sum=sum*hh[i];}
System.out.print(sum);}}
