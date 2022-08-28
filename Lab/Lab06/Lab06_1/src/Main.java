import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double weight=0, feet=0, inches=0;

        System.out.print("Enter name and age: ");
        String name_input = input.nextLine();
        String[] array1 = name_input.split(" ");
        String name = array1[0];
        int age = Integer.parseInt(array1[1]);

        System.out.print("Weight (input format: 1=kg 2=pound value): ");
        String weight_input = input.nextLine();
        String[] stringArray3 = weight_input.split(" ");
        double[] array3 = new double[3];
        for (int i = 0; i < stringArray3.length; i++) {
            array3[i] = Double.parseDouble(stringArray3[i]);
        }
        if(array3[0] == 1) {
            weight = array3[1];    //[kilograms]
        }
        else if(array3[0] == 2) {
            weight = array3[1]* 0.45359237;
        }
        else {
            System.out.print("Error");
            System.exit(1);
        }
        
        System.out.print("Height (input format: 1=meter 2=feet-inch): ");
        String height_input = input.nextLine();
        String[] stringArray2 = height_input.split(" ");
        double[] array2 = new double[3];
        for (int i = 0; i < stringArray2.length; i++) {
            array2[i] = Double.parseDouble(stringArray2[i]);
        }
        if(array2[0] == 1) {
            inches = array2[1]/0.0254;
        }
        else if(array2[0] == 2) {
            feet = array2[1];
            inches = array2[2];
        }
        else{
            System.out.print("Error");
            System.exit(1);
        }

        BMI a1 = new BMI(name, age, weight, feet, inches);
        System.out.printf("Your BMI: %.2f\n", a1.valueBMI());
        System.out.println("Interpretation: " + a1.Interpretation());
    }
}
