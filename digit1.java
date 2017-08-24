import java.util.*;
class digit1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        int count=0;
        char []a=str.toCharArray();
        for(int i=0;i<len;i++){
            if((Character.isDigit(a[i]))||(a[i]=='e')){
                count++;
            }
        }if(count==len){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}
