package ThirtyClass;

public class PartTimeEmployee extends Employee implements TaxCalculator {
    public PartTimeEmployee(String name, double id, int salary) {
        super(name, id, salary);
        if (salary<0){
            throw new InvalidationSalaryException("get back error");
        }
    }
    @Override
    public void calculatingtaxes() {

    }
}
