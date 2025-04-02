public class Intern extends Employee {

    static private final double MAX_SALARY = 20000.0;

    private Intern(String name, String email, int age, Double salary) {
        super(name, email, age, salary);
    }

    public static Intern createIntern(String name, String email, int age, Double salary) {
        if (salary < MAX_SALARY) {
            return new Intern(name, email, age, salary);
        } else {
            System.out.println(name + " salary cannot exceed the maximum allowed value");
            return null;
        }

    }

}
