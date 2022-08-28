public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    Person() {
        this("Unknown","Unknown","Unknown","Unknown");
    }

    Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString1() {
        return "Name: "+name+"\nAddress: "+address+"\nPhone: "+phoneNumber+"\nEmail: "+email;
    }

    public String toString2() {
        return "\nPerson{"+"name="+name+", address="+address+", phoneNumber="+phoneNumber+", email="+email+"}";
    }
}
