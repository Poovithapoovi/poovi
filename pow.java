import java.util.*;
class pow{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,count=0;
        double sum;
        if((a%2)==0){
          b=a/2;
          for(int i=0;i<=b;i++){
            sum=Math.pow(2,i);
            if(sum==a){
                count++;
            }}if(count!=0){
                System.out.print("the number is the power of 2");
            }else{
                System.out.print("the number is not a power of 2");
            }
          
        }else{
            System.out.print("The number is not a power of 2");
        }
    }
}
