import java.util.*;
class reversere{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuffer str1=new StringBuffer(str);
        str1.reverse();
        String str3=str1.toString();
        System.out.println(str3);
        char a[]=str3.toCharArray();
        for(int i=0;i<a.length;i++){
            if((str1.charAt(i)=='a')||(str1.charAt(i)=='e')||(str1.charAt(i)=='i')||(str1.charAt(i)=='o')||(str1.charAt(i)=='u'))
        {
            
        }else{
            System.out.print(str1.charAt(i));
        }
            
        }
            
        }
    }
