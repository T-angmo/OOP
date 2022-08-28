public class Main {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("mm", "cdfsgf", "000", "gfsg");
        System.out.print(p1.toString1());
        System.out.println(p1.toString2()+"\n");
        
        Student s1 = new Student("nn", "yuioh", "111", "vukg", 0);
        System.out.println(s1.toString()+"\n");

        Employee e1 = new Employee("ff", "rfvgh", "555", "nkoij", "12", 30000);
        System.out.println(e1.toString1());
        System.out.print(e1.toString());
        System.out.println(e1.toString2()+"\n");
        
        Faculty f1 = new Faculty("kk", "bhjbo", "444", "vujgvgv", "45", 45000, 15, "A");
        System.out.print(f1.toString());
        System.out.println(f1.toString2()+"\n");

        Staff st1 = new Staff("bb", "vytv", "999", "buyk", "23", 75000, "kkk");
        System.out.print(st1.toString());
        System.out.println(st1.toString2()+"\n");
    }
}
