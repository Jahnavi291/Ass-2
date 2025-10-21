import java.util.Scanner;
public class sumofintegers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int sum=0;
        for(int i=101;i<200;i++)
        {
            if(i%7==0)
            {
                count++;
                sum=sum+i;
            }
        }
        System.out.println("count"+count);
        System.out.println("sum"+sum);
    }
}