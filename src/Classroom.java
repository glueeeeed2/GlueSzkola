import java.util.ArrayList;

public class Classroom {
    private String name;
    private ArrayList<Student> students;
    private Preceptor preceptor;

    public Classroom(String name, Preceptor preceptor) {
        this.name = name;
        this.preceptor = preceptor;
        this.students = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("Student already saved in this class");
            return false;
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        if (!students.contains(student)) {
            System.out.println("Student not found");
            return false;
        }

        students.remove(student);
        return true;
    }

    public void showAllInfoAboutClass() {
        System.out.println("Classroom " + name);
        System.out.println("Preceptor " + preceptor.name);
        System.out.println("Students: " );
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentNumber());
            System.out.println("Name: " + student.name);
        }
;
    }

    public Classroom(String name, ArrayList<Student> students, Preceptor preceptor) {
        this.name = name;
        this.students = students;
        this.preceptor = preceptor;
    }
}
