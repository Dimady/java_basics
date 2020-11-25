package company;

public class Operator extends Staff implements Employee
{
    private Company company;

    private Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Operator(int salary) {
            super(salary);
    }

    @Override
    public int getMonthSalary() {
        return super.getSalary();
    }
}


