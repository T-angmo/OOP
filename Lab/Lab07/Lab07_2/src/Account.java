import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name="";
    private int id=0;
    private double balance=0;
    protected double annualInterestRate=0;
    protected Date dateCreated;
    private ArrayList<Transaction> transactions;

    Account() {
        name = "";
        id = 0;
        balance = 0;
        annualInterestRate = 0;
		dateCreated = new Date(); 
		transactions = new ArrayList<Transaction>();
    }

    Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
		transactions = new ArrayList<Transaction>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {   //ถอน
        if(amount > 0 && amount < balance) {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "Withdraw from account"));
        }
        else {
            System.out.println("Error input amount of withdraw!!!");
        }
        
    }

    public void deposit(double amount) {    //ฝาก
        if(amount > 0) {
            balance += amount;
            transactions.add(new Transaction('D', amount, balance, "Deposit from account"));
        }
        else {
            System.out.println("Error input amount of deposit!!!");
        }
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
