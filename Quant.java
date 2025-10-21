import java.util.Scanner;
public class Quant
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an Integer:");
        int x=sc.nextInt();
        if(x>=100)
        {
            System.out.println("Hugely Positive");
        }
        else if(x>=100&&x<=999)
        {
            System.out.println("Very Positive");
        }
        else if(x>0&&x<100)
        {
            System.out.println("Positive");
        }
        else if(x<0&&x>-100)
        {
            System.out.println("Negative");
        }
        else if(x==0)
        {
            System.out.println("Zero");
        }
        else if(x<=-100&&x>-999)
        {
            System.out.println("Very Negative");
        }
        else if(x<=-1000)
        {
            System.out.println("Hugely Negative");
        }
        System.out.println("");
    }
}