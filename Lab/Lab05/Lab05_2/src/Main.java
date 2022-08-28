public class Main {
    public static void main(String[] args) throws Exception {
        RegularPolygon p1 = new RegularPolygon();       //creates three RegularPolygon objects
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("perimeter= " + p1.getPerimeter());  // display its perimeter and area
        System.out.println("Area= " + p1.getArea());
        System.out.println("perimeter= " + p2.getPerimeter());
        System.out.println("Area= " + p2.getArea());
        System.out.println("perimeter= " + p3.getPerimeter());
        System.out.println("Area= " + p3.getArea());
    }
}
