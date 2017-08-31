import java.util.*;
class height{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]= new int[50];
        for(int i=0;i<50;i++){
            a[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        Arrays.sort(a);
        int h=50-(b+1);
        System.out.print("The" + (b+1)+"th tallest person in the class is "+a[h]);
    }
}
