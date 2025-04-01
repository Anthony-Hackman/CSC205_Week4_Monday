import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return null;
    }

    public String getLastName() {
        return null;
    }
}

class Student extends User {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }
}

class StaffMember extends User {
    public StaffMember(String firstName, String lastName) {
        super(firstName, lastName);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new Student("John", "Doe"));
        users.add(new Student("Peter", "Jenkins"));
        users.add(new Student("Linda", "Jacobs"));
        users.add(new StaffMember("Frank", "Johnson"));
        users.add(new StaffMember("Alyssa", "Yamanao"));

        for (User user : users) {
            System.out.println(user.getFullName());
        }
    }
}