package company;

public class Manager extends Staff implements Employee {
    private double bonus;
    private Company company;

    private Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Manager(int salary) {
            super(salary);
            bonus = 0;
        }

    public void setBonus(double bonus) {
            this.bonus = bonus;
    }

    @Override
    public int getMonthSalary() {
        return (int) (super.getSalary() + bonus);
        }

}
