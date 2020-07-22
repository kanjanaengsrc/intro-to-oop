package Inheritance;
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    
    public HourlyEmployee(String firstName, String lastName, String nationalIdNumber, double wage, double hours) {
        super(firstName, lastName, nationalIdNumber);
        
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        
        if (hours < 0.0 || hours > 720.0) {
            throw new IllegalArgumentException("Hourse worked must be >= 0.0 and <= 720.0");
        }
        
        this.wage = wage;
        this.hours = hours;
    }
    
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        
        this.wage = wage;
    }
    
    public double getWage() {
        return wage;
    }
    
    public void setHours(double hours) {
        if (hours < 0.0 || hours > 720.0) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 720.0");
        }
        
        this.hours = hours;
    }
    
    public double getHours() {
        return hours;
    }
    
    @Override
    public double getEarnings() {
        if (getHours() <= 160) { // no overtime
            return getWage() * getHours();
        } else {
            return 160 * getWage() + (getHours() - 160) * getWage() * 1.5;
        }
    }
    
    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%n%s: %,.2f; %s: %,.2f",
                super.toString(), "Hourly Wage", getWage(), "Hours Worked", getHours());
    }
}