
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Lab01_2 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        a=input.nextDouble();
        System.out.println("Enter value of b : ");
        b=input.nextDouble();
        System.out.println("Enter value of c : ");
        c=input.nextDouble();
        System.out.println("Enter value of d : ");
        d=input.nextDouble();
        System.out.println("Enter value of e : ");
        e=input.nextDouble();
        System.out.println("Enter value of f : ");
        f=input.nextDouble();
        x=(e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        System.out.println("x = " +x);
        System.out.println("y = " +y);
    }

    public static void test() {
        
    }
}
