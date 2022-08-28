public abstract class Box {
    private double width;
    private double length;
    private double height;
    private double radius;

    Box() {
        this.height = 0;
    }

    Box(double height) {
        this.height = height;
    }
    
    public abstract double surfaceArea();
    public abstract double volume();
}