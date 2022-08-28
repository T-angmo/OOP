import java.lang.Math;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle: \n\tSide1 = " + side1 + "\tSide2 = " + side2 + "\tSide3 = " + side3
        + "\n\tArea = " + getArea() + "\tPerimeter = " + getPerimeter() + super.toString();
    } 
}
