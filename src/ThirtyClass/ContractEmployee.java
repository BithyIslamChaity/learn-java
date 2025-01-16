package ThirtyClass;

public class ContractEmployee extends Employee implements TaxCalculator{
    public ContractEmployee(String name, double id, int salary) {
        super(name, id, salary);
        if(salary<0){
            throw new InvalidationSalaryException("get back error");
        }
    }

    @Override
    public void calculatingtaxes() throws InvalidationSalaryException{
double tax = getSalary()*0.025;
    }
}