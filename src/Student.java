public class Student extends Person {
    private int studentNumber;
    private static int studentsNumber;

    public Student(int studentNumber, String name, String lastname , int age) {
        super(name,lastname,age);
        this.studentNumber = studentNumber;
        studentsNumber++;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + "\n"+  " Student ID: " + studentNumber;
    }
}
