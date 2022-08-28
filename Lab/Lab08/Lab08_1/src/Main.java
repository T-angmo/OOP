import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 3 sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("The color is: ");
        String color = input.next();
        System.out.print("The triangle is filled (y/n): ");
        char filled = input.next().charAt(0);
        System.out.println("----------------------------");

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.println(triangle);

    }
}
