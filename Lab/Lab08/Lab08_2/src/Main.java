import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Creating circle 1, input radius: ");
        double radius = input.nextDouble();
        GeometricObject circle1 = new Circle(radius);
        System.out.print("Creating circle 2, input radius: ");
        radius = input.nextDouble();
        GeometricObject circle2 = new Circle(radius);

        System.out.println("------------------------");
        System.out.print("The max circle's radius is ");
        System.out.println(Circle.max(circle1, circle2));
        System.out.println("========================");

        System.out.print("Creating rectangle 1, input width and height: ");
        double width = input.nextDouble();
        double height = input.nextDouble();
        GeometricObject rectangle1 = new Rectangle(width, height);
        System.out.print("Creating rectangle 2, input width and height: ");
        width = input.nextDouble();
        height = input.nextDouble();
        GeometricObject rectangle2 = new Rectangle(width, height);

        System.out.println("------------------------");
        System.out.print("The max rectangle's width and height are ");
        System.out.println(Rectangle.max(rectangle1, rectangle2));
        System.out.println("========================");
    }
}
