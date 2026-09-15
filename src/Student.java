public class Student extends Person implements Onduty  {
    private int studentNumber;
    private static int studentsNumber;

    public Student(int studentNumber, String name, String lastname , int age) {
        super(name,lastname,age);
        this.studentNumber = studentNumber;
        studentsNumber++;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + "\n"+  " Student ID: " + studentNumber;
    }

    @Override
    public void beOnCall() {
        System.out.println("Stolen book");
    }
}
