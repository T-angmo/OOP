public class Course {
    private String courseName;
    private String[] students = new String[20];
    private int numStudent = 0;
    
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if(numStudent >= students.length) {
            String[] larger = new String[students.length+1];
            System.arraycopy(students, 0, larger, 0, students.length);
            students = larger;
        }
        students[numStudent++] = student;
    }

    public void dropStudent(String student) {
        for(int i=0; i<students.length; i++) {
            if(student.equals(students[i])) {
                System.arraycopy(students, i+1, students, i, students.length-(i+1));
                students[numStudent] = null;
                numStudent--;
            }
        }
    }

    public void display() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Number of student: " + numStudent);
        System.out.println("Student: ");
        for(int i=0; i<numStudent; i++) {
            System.out.println("\t " + students[i]);
        }
    }
    public void clear() {
        students = new String[20];
        numStudent = 0;
    }
}
