import java.util.*;
class tar{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int a= sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++){
b[i]=sc.nextInt();}
int c=sc.nextInt();
for(int i=0;i<a;i++){
for(int j=i+1;j<a;j++){
if(b[i]+b[j]==c){
System.out.print(b[i]+" "+b[j]);
break;}}}}}
