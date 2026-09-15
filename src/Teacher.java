public class Teacher extends Person implements Onduty {
    private Subject subject;

    public Teacher(String name, String lastName, Subject subject) {
        super(name,lastName);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject=" + subject +
                '}';
    }

    @Override
    public void beOnCall() {
        System.out.println("fumarCigarrillos");
    }

}
