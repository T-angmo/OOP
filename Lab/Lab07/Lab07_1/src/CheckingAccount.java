//subclass
public class CheckingAccount extends Account {
    protected double overdraftlimit;

    CheckingAccount() {
        super();
        overdraftlimit = 100;
    }

    CheckingAccount(String id, double balance, double overdraftlimit) {
        super(id, balance);
        this.overdraftlimit = overdraftlimit;
    }

    public void setOverdraftlimit(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }

    public double getOverdraftlimit() {
        return overdraftlimit;
    }

    public void withdraw(double amount) {
        if(amount - getBalance() <= overdraftlimit) {
            super.withdraw(amount);
        }
        else {
            System.out.printf("Withdraw: %.2f\n", amount);
            System.out.println("Error! Amount exceeds overdraft limit.");
        }
    }

    public String toString() {
        return super.toString();
    }
}