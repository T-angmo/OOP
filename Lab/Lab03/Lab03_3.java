
import java.util.Scanner;

public class Lab03_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int num = input.nextInt();
        int[] arraynum = new int[num * num];
        int digit = 0, countrow0 = 0, countrow1 = 0, countco0 = 0, countco1 = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++, digit++) {
                arraynum[digit] = (int) (Math.random() * 2); // random number
                System.out.print(arraynum[digit]);
            }
            System.out.println();
        }
        row(arraynum, num);
        column(arraynum, num);
        diagonal(arraynum, num);
        superdiagonal(arraynum, num);
        subdiagonal(arraynum, num);
    }

    public static int row(int[] arraynum, int num) {
        int digit = 0, countrow0 = 0, countrow1 = 0;
        boolean all=false;
        for (int i = 0; i < num; i++) { // check rows
            for (int j = 0; j < num; j++, digit++) {
                if (arraynum[digit] == 0) { // check all 0s
                    countrow0++;
                } else if (arraynum[digit] == 1) { // check all 1s
                    countrow1++;
                }
            }
            if (countrow0 == num) {
                System.out.println("All 0s on row " + (i + 1));
                all=true;
            } else if (countrow1 == num) {
                System.out.println("All 1s on row " + (i + 1));
                all=true;
            }
            countrow0 = 0;
            countrow1 = 0;
        }
        if(all==false){
            System.out.println("No same numbers on a row");
        }
        return 0;
    }

    public static int column(int[] arraynum, int num) {
        int digit = 0, countco0 = 0, countco1 = 0;
        boolean all=false;
        for (int i = 0; i < num; i++) { // check columns
            digit = i;
            for (int j = 0; j < num; j++) {
                if (arraynum[digit] == 0) { // check all 1s
                    countco0++;
                } else if (arraynum[digit] == 1) { // check all 1s
                    countco1++;
                }
                digit = digit + num;
            }
            if (countco0 == num) {
                System.out.println("All 0s on column " + (i + 1));
                all=true;
            } else if (countco1 == num) {
                System.out.println("All 1s on column " + (i + 1));
                all=true;
            }
            countco0 = 0;
            countco1 = 0;
        }
        if(all==false){
            System.out.println("No same numbers on a column");
        }
        return 0;
    }

    public static int diagonal(int[] arraynum, int num) {
        int digit=0, countdi0 = 0, countdi1 = 0;
        for (int j = 0; j < num; j++) {
            if (arraynum[digit] == 0) { // check all 0s
                countdi0++;
            } else if (arraynum[digit] == 1) { // check all 1s
                countdi1++;
            }
            digit += num + 1;
        }
        if (countdi0 == num) {
            System.out.println("All 0s on the diagonal");
        } else if (countdi1 == num) {
            System.out.println("All 1s on the diagonal");
        }
        else{
            System.out.println("No same numbers on the diagonal");
        }
        
        return 0;
    }

    public static int superdiagonal(int[] arraynum, int num) {
        int digit=1, countsuper0 = 0, countsuper1 = 0;
        for (int j = 0; j < num-1; j++) {
            if (arraynum[digit] == 0) { // check all 0s
                countsuper0++;
            } else if (arraynum[digit] == 1) { // check all 1s
                countsuper1++;
            }
            digit += num + 1;
        }
        if (countsuper0 == num-1) {
            System.out.println("All 0s on the superdiagonal");
        } else if (countsuper1 == num-1) {
            System.out.println("All 1s on the superdiagonal");
        }
        else{
            System.out.println("No same numbers on the superdiagonal");
        }
        return 0;
    }

    public static int subdiagonal(int[] arraynum, int num) {
        int digit=num, countsub0 = 0, countsub1 = 0;
        for (int j = 0; j < num-1; j++) {
            if (arraynum[digit] == 0) { // check all 0s
                countsub0++;
            } else if (arraynum[digit] == 1) { // check all 1s
                countsub1++;
            }
            digit += num + 1;
        }
        if (countsub0 == num-1) {
            System.out.println("All 0s on the subdiagonal");
        } else if (countsub1 == num-1) {
            System.out.println("All 1s on the subdiagonal");
        }
        else{
            System.out.println("No same numbers on the subdiagonal");
        }
        return 0;
    }
}
