public class Student extends Person {
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;

    Student() {
        this("Unknown","Unknown","Unknown","Unknown",0);
    }

    Student(String name, String address, String phoneNumber, String email, int status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch(status) {
            case 1 : return "FRESHMAN";
            case 2 : return "SOPHOMORE"; 
			case 3 : return "JUNIOR"; 
			case 4 : return "SENIOR";
			default : return "Unknown"; 
        }
    }

    public String toString() {
        return "Student\n"+super.toString1()+super.toString2() + " Student(status="+getStatus()+"}";
    }
}
