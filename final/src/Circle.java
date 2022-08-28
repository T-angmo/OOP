public class Circle extends Box {
    private double height;
    private double radius;
    private static double pi=3.14;

    Circle() {
        super();
        height = 0;
        radius = 0;
    }

    Circle(double radius, double height) {
        super(height);
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return this.height;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double surfaceArea() {
        return (pi*radius*radius*2)+(2*pi*radius*height);
    }

    @Override
    public double volume() {
        return 3.14*radius*radius*height;
    }
    
}
