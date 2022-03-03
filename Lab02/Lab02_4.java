
import java.util.Scanner;

public class Lab02_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num = input.nextInt();
        if(num<=0 || num>15) {
            System.out.println("Error");
        }
        else {
            for(int i=0; i<num; i++) {
                for(int j=num-i-1; j>0; j--) {
                    System.out.print(" ");
                    System.out.print(" ");                
                }
                if(num>9) {
                    if(i>=9) {
                        for(int m=num-1-i; m>0; m--) {
                            System.out.print(" ");
                        }
                    }
                    else {
                        for(int n=0; n<num-9; n++) {
                            System.out.print(" ");
                        }
                    }
                }
                for(int k=i+1; k>1; k--) {
                    System.out.print(k);
                    System.out.print(" ");
                }
                for(int l=0; l<i+1; l++) {
                    System.out.print(l+1);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
        }
        
    }
}
