
public class Lab03_1 {
    public static void main(String[] args) {
        int num=0, count=0, countprime=0, j=0, sum, n;
        int[] arraynum = new int[100];
        for(int i=1; countprime<100; i++) {
            num=i;
            sum=0;
            count=0;
            for(int k=1; k<=i; k++) {
                if(i%k == 0) {
                    count++;
                }
            }
            if(count==2) {
                while(num>0) {
                    n=num%10;
                    sum=(sum*10)+n;
                    num=num/10;
                }
                if(i==sum) {
                    arraynum[countprime] =i;
                    //System.out.print(i+" ");
                    countprime++;
                }
            }
        }
        for(int i=1; i<=countprime; i++) {
            System.out.print(arraynum[i-1]+" ");
            if(i%10==0) {
                System.out.println();
            }
        }
    }
}
