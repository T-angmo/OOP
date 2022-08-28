import java.util.Scanner;

public class S1Q1_64010256 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size of matrix : ");
        int size = input.nextInt();
        System.out.println("Random matrix is :");
        int[] arraynum = new int[size*size];
        int digit =0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++, digit++) {
                arraynum[digit] = (int) (Math.random() * 10); // random number
                System.out.print(arraynum[digit]+" ");
            }
            System.out.println();
        }
        
        System.out.print("Please input value of Row and Column : ");
        int row = input.nextInt();
        int column = input.nextInt();
        // System.out.println(row);
        // System.out.println(column);
        
        digit = 0;
        System.out.print("The selected member is ");
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j < size; j++, digit++) {
            }
        }
        System.out.println(arraynum[digit+column-1]);
        // System.out.print(digit+column-1);
        System.out.print("(i)Members on Top : ");
        if(row == 1) {
            System.out.println("NO");
        }
        else {
            digit = column-1;
            for(int i=0; i< row-1; i++) {
                System.out.print(arraynum[digit] +" ");
                digit += size;
            }
        }
        
        System.out.print("(ii)Members on the Right Hand Side : ");
        digit=0;
        System.out.print("(iii)Members at the Bottom : ");
        if(row == size) {
            System.out.println("NO");
        }
        else {
            for (int i = 0; i < row-1; i++) {
                for (int j = 0; j < size; j++, digit++) {
                }
            }
            for(int i=row; i< size; i++) {
                System.out.print(arraynum[digit] +" ");
                digit += size;
            }
        }
        // System.out.print("(iv)Members on the Left Hand Side :");
        // System.out.println("End of program");
    }
}
