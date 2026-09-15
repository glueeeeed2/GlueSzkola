public abstract class Person {
    protected String name;
    private String lastName;

    private int age;

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.age = 0;
    }
}
