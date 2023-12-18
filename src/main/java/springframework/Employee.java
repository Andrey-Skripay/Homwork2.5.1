package springframework;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int hashCode() {
        // реализация метода hashCode
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        // реализация метода equals
        return false;
    }

    @Override
    public String toString() {
        // реализация метода toString
        return null;
    }
}