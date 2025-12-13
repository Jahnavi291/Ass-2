import java.util.Scanner;
public class bmi
{
    public static void main(String args[])
    {
    
    
            Scanner sc = new Scanner(System.in);
    
            // Input
            System.out.print("Enter weight in kilograms: ");
            double weight = sc.nextDouble();
    
            System.out.print("Enter height in meters: ");
            double height = sc.nextDouble();
    
            // BMI calculation
            double bmi = weight / (height * height);
    
            System.out.printf("Your BMI is: %.2f\n", bmi);
    
            // BMI Category
            if (bmi < 15) {
                System.out.println("Very severely underweight");
            } else if (bmi >= 15 && bmi < 16) {
                System.out.println("Severely underweight");
            } else if (bmi >= 16 && bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.println("Normal (Healthy weight)");
            } else if (bmi >= 25 && bmi < 30) {
                System.out.println("Overweight");
            } else if (bmi >= 30 && bmi < 35) {
                System.out.println("Obese Class I (Moderately obese)");
            } else if (bmi >= 35 && bmi < 40) {
                System.out.println("Obese Class II (Severely obese)");
            } else {
                System.out.println("Obese Class III (Very severely obese)");
            }
    
            
        }
    }


