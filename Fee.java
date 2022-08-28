import java.util.Scanner;

public class Fee {
    public static void main(String[] args) {
        int earn,fee=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter earn : ");
        earn = input.nextInt();
        if(earn>5000000) {
            fee += (earn-5000000)*35/100;
            earn -= (earn - 5000000);
        }
        if(earn>2000000) {
            fee += (earn-2000000)*30/100;
            earn -= (earn - 2000000);
        }
        if(earn>1000000) {
            fee += (earn-1000000)*25/100;
            earn -= (earn - 1000000);
        }
        if(earn>750000) {
            fee += (earn-750000)*20/100;
            earn -= (earn - 750000);
        }
        if(earn>500000) {
            fee += (earn-500000)*15/100;
            earn -= (earn - 500000);
        }
        if(earn>300000) {
            fee += (earn-300000)*10/100;
            earn -= (earn - 300000);
        }
        if(earn>150000) {
            fee += (earn-150000)*5/100;
            earn -= (earn - 150000);
        }
        System.out.println("Fee = "+fee);
    }
}
