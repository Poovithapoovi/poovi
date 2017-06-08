import java.util.*;
import java.util.Arrays;
class duplicate
{
    public static void main(String [] args)
    {
        Scanner a=new Scanner(System.in);
        int b[]=new int[5];
        int k;
        for(k=0;k<5;k++)
    {
         b[k]=a.nextInt();    }
        int i,j,l=1;
        for(i=0;i<5;i++)
        {
            for(j=0;j<i+1;j++)
            {
                if(b[i]==b[j])
                {
                    System.out.print(b[i]);
                    l=0;
                }
            }
        }
        if(l==1)
        {
            System.out.print("0");
        }
    }
}
