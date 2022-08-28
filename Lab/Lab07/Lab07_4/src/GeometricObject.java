public class GeometricObject {
    private String color;
    private boolean filled;

    GeometricObject() {
        color = "white";
        filled = false;
    }

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean getFilled() {
        return filled;
    }

    public static void displayObject(Object object) {
        GeometricObject geometricObject = (GeometricObject) object;
        System.out.println(geometricObject.toString());
    }

    @Override
    public String toString() {
        return "\n\tColor = "+getColor()+"\tFilled = "+getFilled();
    }
}
