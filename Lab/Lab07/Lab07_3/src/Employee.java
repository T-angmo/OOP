public class Employee extends Person {
    private String office;
    private double salary;

    Employee() {
        this("Unknown","Unknown","Unknown","Unknown", "Unknown", 0);
    }

    Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString1() {
            return "Employee";
    }

    public String toString() {
        return super.toString1()+"\nOffice: "+getOffice()+"\nSalary: "+getSalary();
    }
}
