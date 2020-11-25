package company;

public class Main {
        static final int A = 10;
        static final int B = 80;
        static final int C = 180;
        static final int D = (A + B + C) / 2;
        static final int E = 15;
        static final int F = 30;
        public static void main(String[] args) {
                Company company = new Company();
                company.setIncome((long) (5E6 + 1E7 * Math.random()));
                for (int i = 0; i < A; i++) {
                        TopManager topmanager = new TopManager((int) (4E4 + 2E4 * Math.random()));
                        company.hire(topmanager);
                        topmanager.isBonus();
                }
                for (int i = 0; i < B; i++) {
                        Manager manager = new Manager((int) (4E4 + 2E4 * Math.random()));
                        company.hire(manager);
                        manager.setBonus(0.05f * (115E3 + 25E3 * Math.random()));
                }
                for (int i = 0; i < C; i++) {
                        Operator operator = new Operator((int) (4E4 + 2E4 * Math.random()));
                        company.hire(operator);
                }
                System.out.println("Доход компании составил: " + company.getIncome() + " руб.");
                System.out.println("В компанию наняли " + (A + B + C) + " сотрудников.");
                System.out.println("Самые высокие зарплаты: ");
                company.list(company.getTopSalaryStaff(E));
                System.out.println("Самые низкие зарплаты: ");
                company.list(company.getLowestSalaryStaff(F));
                for (int i = 0; i < D; i++) company.fire(i);
                System.out.println("Из компании уволили " + D + " сотрудников.");
                System.out.println("Самые высокие зарплаты: ");
                company.list(company.getTopSalaryStaff(E));
                System.out.println("Самые низкие зарплаты: ");
                company.list(company.getLowestSalaryStaff(F));
        }
}
