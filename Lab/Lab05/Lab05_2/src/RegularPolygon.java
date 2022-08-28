class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    // default constructor
    public RegularPolygon() {   //no-arg constructor that creates a regular polygon with default values
        n = 3;
        side = 1;
        x = y = 0;
    }

    // parameterized constructor
    public RegularPolygon(int m, double len) {  //constructor that creates a regular polygon with the specified number of
        n = m;                                  //sides and length of side, centered at (0, 0)
        side = len;
        x = y = 0;
    }

    // parameterized constructor
    public RegularPolygon(int m, double len, double a, double b) { //constructor that creates a regular polygon with the specified number of
        n = m;                                                     //sides,length of side, and x- and y-coordinates
        side = len;
        x = a;
        y = b;
    }

    public void setNumberOfSide(int m) {    //mutator methods for all data fields
        n = m;
    }

    public void setSideLength(double len) {
        side = len;
    }

    public void setXcoordinate(double a) {
        x = a;
    }

    public void setYcoordinate(double b) {
        y = b;
    }

    public int getNumberOfSide() {  //accessor methods for all data fields
        return n;
    }

    public double getSideLength() {
        return side;
    }

    public double getXcoordinate() {
        return x;
    }

    public double getYcoordinate() {
        return y;
    }

    // finds perimeter
    public double getPerimeter() {  //Perimeter = เส้นรอบรูป
        return n * side;
    }

    // find area
    public double getArea() {
        double area = (n * side * side) / (Math.tan(Math.PI / n) * 4);
        return area;
    }
}