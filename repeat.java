import java.util.*;
class repeat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                    if(b[i]==b[j]){
                        System.out.print(b[i]+" ");
                    }
                
            }
        }
    }
}
