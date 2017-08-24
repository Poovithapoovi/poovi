import java.util.*;
class strarr{
    public static void main(String args[]){
        int i,count=0;
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int b[]=new int[len];
        for(i=0;i<len;i++){
            b[i]=arr[i];
        }Arrays.sort(arr);
        for(i=0;i<len;i++){
            if(arr[i]==b[i]){
                count++;
            }
        }if(count==len){
            System.out.print("the array is in the sorted form");
        }else{
            System.out.print(" the array is not in the sorted form");
        }
    }
}
