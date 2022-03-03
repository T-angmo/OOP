
import java.util.Scanner;

public class Lab01_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextFloat();
        System.out.println("Enter height in inches: ");
        double height = input.nextFloat();
        weight = weight*0.45359237;
        height = height*0.0254;
        double bmi = weight/(height*height);
        System.out.println("BMI is "+bmi);
    }
}
