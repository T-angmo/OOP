import java.util.Date;

public class Account {
    protected String id;
    protected double balance;
    protected double preBalance;
    protected double annualInterestRate;
    protected Date dateCreated;

    Account() {
        id = "";
        balance = 0;
        preBalance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
        preBalance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getPreBalance() {
        return preBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void deposit(double amount) {
        System.out.printf("Deposit: %.2f\n", amount);
        balance = balance + amount;
        
    }

    public void withdraw(double amount) {
        System.out.printf("Withdraw: %.2f\n", amount);
        balance = balance - amount;
    }

    public String toString() {
        return "This account was created at " + dateCreated;
    }
}
