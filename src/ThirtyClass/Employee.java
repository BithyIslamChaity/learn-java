package ThirtyClass;

abstract class Employee {
    public Employee(String name, double id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    String name;
    double id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    double salary;
}



