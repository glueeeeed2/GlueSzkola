//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // You can create type person and object student

        Person student = new Student(2, "Jan", "Kowalski", 3);


        Student student1 = new Student(5, "Bartek", "B", 10);


        System.out.println(student);
        System.out.println(student1);


        Preceptor teacher = new Preceptor("Joanna", "Kowalska", Subject.MATH);

        Classroom classroom = new Classroom("2pt", teacher);
        classroom.addStudent(student1);
        classroom.showAllInfoAboutClass();

        School mechanik = School.getSchool("Zespol Szkol Politechnicznych");

    }
}