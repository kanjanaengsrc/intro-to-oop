package Inheritance;
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, String nationalIdNumber,
            double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, nationalIdNumber, grossSales, commissionRate);
        
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        
        this.baseSalary = baseSalary;
    }
    
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    @Override
    public double getEarnings() {
        return super.getEarnings() + getBaseSalary();
    }
    
    @Override
    public String toString() {
        return String.format("Base-Salaried %s; %s: %,.2f", super.toString(), "Base Salary", getBaseSalary());
    }
}