
import java.util.Scanner;

// Write a program that reads an integer between 0 and 1000 and adds all the digits in the 
// integer. For example, if an integer is 932, the sum of all its digits is 14.
public class Lab01_3 {
    public static void main(String[] args) {
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000 : ");
        int num = input1.nextInt();
        int sum=0;
        if(num<=0 || num>=1000) {
            System.out.println("Error");
        }
        else {
            if(num>99) {
                sum += num%10;
                num = num/10;
                sum += num%10;
                num = num/10;
                sum += num;
                System.out.println("The sum of the digits is " +sum);
            }
            else if(num>9) {
                sum += num%10;
                num = num/10;
                sum += num;
                System.out.println("The sum of the digits is " +sum);
            }
            else {
                sum += num;
                System.out.println("The sum of the digits is " +sum);
            }
        }
                
    }
}
