package Inheritance;
public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String firstName, String lastName, String nationalIdNumber,
            double grossSales, double commissionRate) {
        super(firstName, lastName, nationalIdNumber);
        
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        
        this.grossSales = grossSales;
    }
    
    public double getGrossSales() {
        return grossSales;
    }
    
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        
        this.commissionRate = commissionRate;        
    }
    
    public double getCommissionRate() {
        return commissionRate;
    }
    
    @Override
    public double getEarnings() {
        return getCommissionRate() * getGrossSales();
    }
    
    @Override
    public String toString() {
        return String.format("Commission Employee: %s%n%s: %,.2f; %s: %.2f",
                super.toString(), "Gross Sales", getGrossSales(),
                "Commission Rate", getCommissionRate());
    }
}