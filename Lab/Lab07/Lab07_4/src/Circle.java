public class Circle extends GeometricObject {
    private double radius;
    private double pi = 3.14;

    Circle() {
        radius = 1;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return pi*radius*radius;
    }

    public double getPerimeter() {
        return 2*pi*radius;
    }

    public double getDiameter() {
        return 2*radius;
    }

    @Override
    public String toString() {
        return "Circle: \n\tRadius = " + radius + "\n\tArea = " + getArea() + "\tPerimeter = " + getPerimeter()
        + "\tDiameter = " + getDiameter() + super.toString();
    } 
}
