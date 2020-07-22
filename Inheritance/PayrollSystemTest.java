package Inheritance;
public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 100_000.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 500.00, 160);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 1_200_000.00,
                .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
                "444-44-4444", 600_000.00, .04, 36_000.00);

        System.out.printf("----------Employees processed individually:----------%n%n");

        System.out.printf("%s%nEarned: %,.2f%n%n", salariedEmployee, salariedEmployee.getEarnings());
        System.out.printf("%s%nEarned: %,.2f%n%n", hourlyEmployee, hourlyEmployee.getEarnings());
        System.out.printf("%s%nEarned: %,.2f%n%n", commissionEmployee, commissionEmployee.getEarnings());
        System.out.printf("%s%nEarned: %,.2f%n%n", basePlusCommissionEmployee,
                basePlusCommissionEmployee.getEarnings());

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        System.out.printf("Employees processed polymorphically:%n%n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            // Raise salary for BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // Downcast Employee reference to BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = 
                        (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("New base salary with 10%% increase is: %,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("Earned: %,.2f%n%n", currentEmployee.getEarnings());
        }
        // Show type name of each object in employees array
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Employee %d is a %s%n", i, employees[i].getClass().getName());
        }
    }
}