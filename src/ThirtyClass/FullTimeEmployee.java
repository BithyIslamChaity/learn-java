package ThirtyClass;

public class FullTimeEmployee extends Employee implements TaxCalculator {
    public FullTimeEmployee(String name, double id, int salary) {
        super(name, id, salary);
        double salry = 0;
        if(salry<0){
            throw new InvalidationSalaryException("get back error");
        }
    }
    @Override
    public void calculatingtaxes() throws InvalidationSalaryException {
        double tax = getSalary() * 0.05;
    }
}