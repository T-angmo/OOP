public class Main {
    public static void main(String[] args) throws Exception {
        GeometricObject triangle1 = new Triangle(3, 4, 5, "RED", true);
        GeometricObject circle1 = new Circle(14, "GREEN", false);
        GeometricObject rectangle1 = new Rectangle(8.7, 10.9, "Blue", true);

        GeometricObject.displayObject(triangle1);
        GeometricObject.displayObject(circle1);
        GeometricObject.displayObject(rectangle1);
    }
}
