public class Main {
    public static void main(String[] args) throws Exception {
        Course course = new Course("OOP");
        course.addStudent("Natruja");
        course.addStudent("Tangmo");
        course.addStudent("Mo");
        course.dropStudent("Tangmo");
        course.display();
    }
}
