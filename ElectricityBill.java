import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Number: ");
        int customerNo = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 200) {
            bill = units * 0.50;
        }
        else if (units <= 400) {
            bill = 100 + (units - 200) * 0.65;
        }
        else {
            bill = 230 + (units - 400) * 0.80;
        }

        System.out.println("Customer Number: " + customerNo);
        System.out.println("Units Consumed: " + units);
        System.out.println("Amount to be Paid: Rs." + bill);

        sc.close();
    }
}