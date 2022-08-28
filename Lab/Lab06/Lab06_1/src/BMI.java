public class BMI {
    private String name;
    private int age;
    private double weight=0;
    private double feet=0;
    private double inches=0;
    private double BMI=0;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }
    public double valueBMI() {
        double height = ((feet*12) + inches)*0.0254;
        BMI = weight/(height*height);
        return BMI;
    }

    public String Interpretation() {
        if(BMI<18.5) {
            return "Underweight";
        }
        else if(18.5 <= BMI && BMI < 25.0) {
            return "Normal weight";
        }
        else if(25.0 <= BMI && BMI < 30.0) {
            return "Overweight";
        }
        else if(30.0 <= BMI) {
            return "Obese";
        }
        return null;
    }
}