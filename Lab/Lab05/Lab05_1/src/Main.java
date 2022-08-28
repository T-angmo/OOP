public class Main {
    public static void main(String[] args) throws Exception {
        Account account1 = new Account(1122, 20000, 0.045);
        java.util.Date dateCreated = new java.util.Date();
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Account ID: " + account1.getId());
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Interest Rate: " + account1.getAnnualInterestRate()+"%");
        account1.withdraw(2500);
        System.out.println("Balance after withdraw of 2500: " + account1.getBalance());
        account1.deposit(3000);
        System.out.println("Balance after deposit of 3000: " + account1.getBalance());
        System.out.println("Monthly Interest: " + account1.getMonthlyInterest());
    }
}