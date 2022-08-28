//subclass
public class SavingAccount extends Account {

    SavingAccount() {
        super();
    }

    SavingAccount(String id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if(amount <= getBalance()) {
            super.withdraw(amount);
        }
        else {
            System.out.printf("Withdraw: %.2f\n", amount);
            System.out.println("Error! Savings account overdrawn transtaction rejected");
        }
    }

    public String toString() {
        return super.toString();
    }
}
