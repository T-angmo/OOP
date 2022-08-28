public class Main {
    public static void main(String[] args) {
        
        Account a1 = new Account("George", 1122, 1000);

        a1.setAnnualInterestRate(1.5);
        a1.deposit(30);
        a1.deposit(40);
        a1.deposit(50);
        a1.withdraw(5);
        a1.withdraw(4);
        a1.withdraw(2);

        System.out.println("Name: "+a1.getName());
        System.out.println("Account ID: "+a1.getId());
        System.out.println("Annual interest rate: "+a1.getAnnualInterestRate());
        System.out.printf("Balance: %.2f\n",a1.getBalance());
        System.out.println("Date\t\t\t\tType\t\tAmount\t\tBalance");
        
        for(int i=0; i<a1.getTransactions().size(); i++) {
            System.out.print(a1.getTransactions().get(i).getDate());
            System.out.print("\t"+a1.getTransactions().get(i).getType());
            System.out.printf("\t\t%.2f",a1.getTransactions().get(i).getAmount());
            System.out.printf("\t\t%.2f\n",a1.getTransactions().get(i).getBalance());
        }
    }
}
