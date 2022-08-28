import java.util.Scanner;
import java.util.Random;

public class S1Q2_64010256 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int[] numrand = new int[5];
        int numrand, leng1=10;
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        char[] abc = {'a','b','c','d','e','f','g','h','i','j'};

        System.out.print("Random characters are : ");
        Random rand = new Random();
        for(int i=0; i<5; i++, leng1--) {       
            numrand = num[rand.nextInt(leng1)];
            System.out.print(numrand+" ");
            for(int j=0; j<leng1; j++) {  
                if(numrand == num[j]) {
                    for(int k=j; k<leng1-j; k++) {
                        num[k] =num[k++];

                    }
                }
            }
        }
        System.out.println();
        for(int i=0; i<leng1; i++) {
            System.out.print(num[i]+" ");
        }
        // System.out.print("Selest group of charcters [1] character or [2] numeric : ");
        // System.out.print("Charcters not in the list are : ");
        // System.out.print("End of program");
    }
}
