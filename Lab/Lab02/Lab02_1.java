
import java.util.Scanner;

public class Lab02_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = input.nextInt();
        System.out.print("Enter the number of day elapsed since today: ");
        int elapsed = input.nextInt();
        if (day < 0) {
            System.out.println("Error");
        } else {
            System.out.print("Today is ");
            switch (day) {
                case 0:
                    System.out.print("Sunday");
                    break;
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thurseday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    break;
            }

            System.out.print(" and the future dat is ");
            switch ((day + elapsed) % 7) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thurseday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
            }
        }

    }
}