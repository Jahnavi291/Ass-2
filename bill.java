import java.util.Scanner;
public class bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of calls made: ");
        int calls=sc.nextInt();
        double bill=250;
        if(calls >=100)
        {
            bill +=(calls-100)*1.25;

        }
        System.out.printf("Total bill amount: Rs.%.2f%n" ,bill);

    }
}