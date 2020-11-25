package company;

import java.util.*;

public class Company {
    ArrayList<Employee> staff = new ArrayList<Employee>();
    private long income;

    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    public void hire(Employee e) {
        staff.add((Employee) e);
        e.setCompany(Company.this);
    }

    public void hireAll(List<Employee> emp){
        for (Employee e : staff) {
            hire(e);
        }
    }

    public void fire(int i) {
        staff.remove(i);
    }

    public void list(List<Employee> emp) {
        int count = 0;
        for (Employee e : emp) {
            count++;
            System.out.println(count + ". " + e.getMonthSalary() + " руб.");
        }
    }

    List<Employee> getTopSalaryStaff (int count) {
        ArrayList<Employee> sort1 = new ArrayList<Employee>();
        Collections.sort(staff, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                if (o1.getMonthSalary() > o2.getMonthSalary()) return -1;
                else if (o1.getMonthSalary() < o2.getMonthSalary()) return 1;
                else return 0;
            }
        });
        if (count < staff.size()) sort1.addAll(staff.subList(0,count));
        else { System.out.println("Превышено количество сотрудников"); System.exit(0); }
        return sort1;
  }

    List<Employee> getLowestSalaryStaff(int count)
  {
      ArrayList<Employee> sort2 = new ArrayList<Employee>();
      Collections.sort(staff, new Comparator<Employee>() {
          public int compare(Employee o1, Employee o2) {
              if (o1.getMonthSalary() > o2.getMonthSalary()) return 1;
              else if (o1.getMonthSalary() < o2.getMonthSalary()) return -1;
              else return 0;
          }
      });
      if (count < staff.size()) sort2.addAll(staff.subList(0,count));
      else { System.out.println("Превышено количество сотрудников"); System.exit(0); }
      return sort2;
  }
}