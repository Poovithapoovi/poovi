import java.util.*;
class sumarray{
public static void main(String args []){
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b[]=new Int[a];
for(int i=0;i<a;i++){
b[i]=sc.nextInt();}
for(int i=0;i<a;i++){
for(int j=0;j<a;j++){
for(int k=0;k<a;k++){
if(b[i]+b[j]==b[k]){
System.out.print(a[i]+"+"+a[j]+"="+a[k]);}}}}}
