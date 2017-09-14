import java.util.*;
class smallnum{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
String str= sc.next();
int k=sc.nextInt();
String st[]=str.split("");
int h[]=new int[st.length];
for(int i=0;i<st.length;i++){
h[i]=Integer.parseInt(st[i]);}
Arrays.sort(h);
for(int i=0;i<h.length-k;i++){
System.out.print(h[i]);}}}
