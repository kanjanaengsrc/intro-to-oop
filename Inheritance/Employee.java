package Inheritance;
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String nationalIdNumber;
    
    public Employee(String firstName, String lastName, String nationalIdNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdNumber = nationalIdNumber;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getNationalIdNumber() {
        return nationalIdNumber;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s%nNational ID Number: %s",
                getFirstName(), getLastName(), getNationalIdNumber());
    }
    
    public abstract double getEarnings();
}