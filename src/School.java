import java.util.ArrayList;

public class School {
     private static School school;
     private String name;
     private ArrayList<Student> students;
     private ArrayList<Classroom> classrooms;
     private ArrayList<Teacher> teachers;

     // Singleton Pattern


    // Private constructor
    private School(String name) {
        this.name = name;
        this.classrooms = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    // Create object school via private constructor when is not created

    public static School getSchool(String name) {
        if (school == null) {
            school = new School(name);
        }

        return school;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", classrooms=" + classrooms +
                ", teachers=" + teachers +
                '}';
    }
}
