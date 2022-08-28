public class Box {
    private String shape;
    private double width;
    private double length;
    private double height;
    private double radius;
    private static double pi;

    Box() {
        this.shape = "~~~";
        this.width = 0;
        this.length = 0;
        this.height = 0;
        this.radius = 0;
        setPi();
    }

    Box(String shape, double width, double length, double height) { //rectangle
        this.shape = shape;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    Box(String shape, double radius, double height) {   //circle
        this.shape = shape;
        this.radius = radius;
        this.height = height;
        setPi();
    }

    public double surfaceArea() {
        double area=0;
        if(shape == "rectangle") {
            area = (width*length*2)+(width*height*2)+(length*height*2);
        }
        else if(shape == "circle") {
            area = (pi*radius*radius*2)+(2*pi*radius*height);
        }
        return area;
    }

    public double volume() {
        double volume=0;
        setPi();
        if(shape == "rectangle") {
            volume = (width*length*height);
        }
        else if(shape == "circle") {
            volume = (pi*radius*radius*height);
        }
        return volume;
    }

    public void disPlay() {
        System.out.println("Shape : "+shape);
        if(shape == "rectangle") {
            System.out.println("Width : "+width);
            System.out.println("Length : "+length);
        }
        else if(shape == "circle") {
            System.out.println("Radius : "+radius);
        }
        else {
            System.out.println("Width : "+width);
            System.out.println("Length : "+length);
            System.out.println("Radius : "+radius);
        }
        System.out.println("Height : "+height);
        System.out.println("Surface area : "+surfaceArea());
        System.out.println("Volume : "+volume());
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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private static void setPi() {
        pi = 3.14159;
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

    public double getRadius() {
        return this.radius;
    }
}
