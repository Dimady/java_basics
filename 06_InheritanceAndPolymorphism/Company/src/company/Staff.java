package company;

public abstract class Staff {

    private int salary;

    Staff(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
