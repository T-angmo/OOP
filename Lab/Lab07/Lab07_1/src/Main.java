public class Main {
    public static void main(String[] args) throws Exception {
        Account a1 = new Account("22", 5000);
        System.out.println("Normal Account");
        System.out.printf("Balance is %.2f\n", a1.getBalance());
        a1.withdraw(2000);
        a1.deposit(3000);
        System.out.printf("Balance is %.2f\n", a1.getBalance());
        System.out.println(a1+"\n");
        
        CheckingAccount c1 = new CheckingAccount("23", 5000, 1000);
        System.out.println("Checking Account");
        System.out.printf("Overdraft Limit: %.2f\n", c1.getOverdraftlimit());
        System.out.printf("Balance is %.2f\n", c1.getBalance());
        c1.withdraw(6100);
        System.out.printf("Balance is %.2f\n", c1.getBalance());
        System.out.println(c1+"\n");
        
        SavingAccount s1 = new SavingAccount("24", 5000);
        System.out.println("Saving Account");
        System.out.printf("Balance is %.2f\n", s1.getBalance());
        s1.withdraw(6000);
        System.out.printf("Balance is %.2f\n", s1.getBalance());
        System.out.println(s1);
    }
}
