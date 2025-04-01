public class Student extends User {
    private String major;

    public Student(String firstName, String lastName, String major) {
        super(firstName, lastName);
        this.major = major;
    }

    public void printNames() {
        System.out.println("Student Name: " + getFirstName() + " " + getLastName());
        System.out.println("Major: " + major);
    }

    public String getFirstName() {
        return super.getFirstName();
    }

    public String getLastName() {
        return super.getLastName();
    }

    public String getMajor() {
        return major;
    }
}