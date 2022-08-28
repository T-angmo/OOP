public class Rectangle extends Box {
    private double width;
    private double length;
    private double height;

    Rectangle() {
        super();
        width = 0;
        length = 0;
    }

    Rectangle(double width, double length, double height) {
        super(height);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double surfaceArea() {
        return (width*length*2)+(width*height*2)+(length*height*2);
    }

    @Override
    public double volume() {
        double v= width*length*height;
        return v;
    }
}
