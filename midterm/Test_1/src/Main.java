public class Main {
    public static void main(String[] args) throws Exception {
        Box b1 = new Box("circle", 14, 15.6);
        Box b2 = new Box("rectangle", 17.2, 15, 9.7);
        Box b3 = new Box();
        b1.disPlay();
        b2.disPlay();
        b3.disPlay();
    }
}
