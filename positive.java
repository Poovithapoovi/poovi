import java.util.Scanner;
class positive
{
    public static void main(String [] args)
    {
        int a;
        Scanner b=new Scanner(System.in);
        a= b.nextInt();
        if(a==0)
        {
            System.out.print("Zero");
            
        }
        else
        {
            if(a>0)
            {
                System.out.print("Positive");
                
            }
            else
            {
                System.out.print("Negative");
                
                
            }
        }
        
    }
}
