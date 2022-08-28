import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate; // stores the current interest rate
    private Date dateCreated; // stores the date account created

    // no arg construtor
    Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
    }

    // constructor with specific id and initial balance
    Account(int newId, double newBalance, double newAnnualInterestRate) {
        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnualInterestRate;
    }

    // accessor/mutator methods for id, balance, and annualInterestRate
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate * 100;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    // accessor method for dateCreated
    public void setDateCreated(Date newDateCreated) {
        dateCreated = newDateCreated;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return balance * (annualInterestRate / 12);
    }

    double withdraw(double amount) {
        return balance -= amount;
    }

    double deposit(double amount) {
        return balance += amount;
    }
}