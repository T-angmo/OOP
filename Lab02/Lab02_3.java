
import java.util.Scanner;

public class Lab02_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city[]=new String[3];
        String temp;
        System.out.print("Enter the first city: ");
        city[0] = input.nextLine();
        System.out.print("Enter the second city: ");
        city[1] = input.nextLine();
        System.out.print("Enter the third city: ");
        city[2] = input.nextLine();

        for(int i=0; i<3; i++) {
            for(int j=i+1; j<3; j++) {
                if(city[i].compareTo(city[j])>0) {
                    temp = city[i];
                    city[i] = city[j];
                    city[j] = temp;
                }
            }
        }

        System.out.print("The three cities in alphabet ordor are ");
        for(int i=0; i<3; i++) {
            System.out.print(city[i]+" ");
        }
    }
}
