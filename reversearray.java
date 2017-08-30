import java.util.*;
class reversearray{
    public static void main(String args []){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++){
            b[i]=s.nextInt();
        }Arrays.sort(b);
        for(int j=a-1;j>=0;j--){
            System.out.println(b[j]);
        }
    }
}
