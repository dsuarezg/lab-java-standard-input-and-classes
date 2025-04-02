public class Intern extends Employee {

    static private final double MAX_SALARY = 2000.0;

    public Intern(String name, String email, int age, Double salary) {
        super(name, email, age, salary);
    }

    @Override
    public void setSalary(Double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Intern salary cannot exceed " + MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }


}
