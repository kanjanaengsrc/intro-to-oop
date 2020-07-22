package Inheritance;
public class SalariedEmployee extends Employee {
    private double salary;
    
    public SalariedEmployee(String firstName, String lastName, String nationalIdNumber, double salary) {
        super(firstName, lastName, nationalIdNumber);
        
        if (salary < 0.0) {
            throw new IllegalArgumentException("Salary must be >= 0.0");
        }
        
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary < 0.0) {
            throw new IllegalArgumentException("Salary must be >= 0.0");
        }
        
        this.salary = salary;        
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public double getEarnings() {
        return getSalary();
    }
    
    @Override
    public String toString() {
        return String.format("Salaried Employee: %s%n%s: %,.2f", super.toString(), "Salary", getSalary());
    }
}