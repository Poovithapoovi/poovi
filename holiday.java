import java.util.*;
class holiday{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=s1.toLowerCase();
        switch(s2){
            case "sunday": System.out.print("false");
            break;
            case "monday": System.out.print("true");
            break;
            case "tuesday": System.out.print("true");
            break;
            case "wednesday": System.out.print("true");
            break;
            case "thursday": System.out.print("true");
            break;
            case "friday": System.out.print("true");
            break;
            case "saturday": System.out.print("true");
            break;
            default: System.out.print("this is not a day");
        }
    }
}
