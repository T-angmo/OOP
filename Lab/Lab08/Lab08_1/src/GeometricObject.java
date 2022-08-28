import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
        color = "white";
        filled = false;
    }

    protected GeometricObject(String color, char filled) {
        this.color = color;
        if(filled == 'y') {
            this.filled = true;
        }
        else if(filled == 'n') {
            this.filled = false;
        }
        
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "\nThe color is "+getColor()+"\nTriangle is filled: "+isFilled();
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
