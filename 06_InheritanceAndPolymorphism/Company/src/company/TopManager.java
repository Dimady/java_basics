package company;

public class TopManager  extends Staff implements Employee {
    private double bonus;
    private Company company;

    private Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public TopManager(int salary)
    {
        super(salary);
    }

    public void isBonus() {
        if (getCompany().getIncome() > 1E7) this.bonus = 1.5f * super.getSalary();
        else this.bonus = 0;
    }

    @Override
    public int getMonthSalary()
    {
        return (int) (super.getSalary() + bonus);
    }
}

