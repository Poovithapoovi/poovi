import java.util.Scanner;
class even
{
    public static void main(String [] args)
    {
        Scanner b=new Scanner(System.in);
        int a= b.nextInt();
        if((a%2)==0)
        {
            System.out.print("Even");
        }
        else
        {
            System.out.print("Odd");
        }
    }
}
