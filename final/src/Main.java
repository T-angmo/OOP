public class Main {
    public static void main(String[] args) throws Exception {
        Rectangle rec = new Rectangle(5.0, 4.0, 7.0);
        System.out.println("Rectangle Box");
        System.out.println("Surface area = " + rec.surfaceArea());
        System.out.println("Volume = " + rec.volume());

        Circle cir = new Circle(14, 8);
        System.out.println("Circle box");
        System.out.println("Surface area = " + cir.surfaceArea());
        System.out.println("Volume = " + cir.volume());
    }
}
