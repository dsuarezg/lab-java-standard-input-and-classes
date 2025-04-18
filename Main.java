import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main{


    public static void main(String[] args) throws IOException {
        var employees = new FileWriter("employees.txt",true);
        var random = new Random();

        for (int i = 0; i < 10; i++) {
            if(random.nextDouble()>0.5){
                Employee employee = new Employee("Employee"+ i,"Employee"+ i + "@mail.com", random.nextInt(18,65), random.nextDouble(15000,30000));
                employees.write(employee.getName() + ", " + employee.getEmail() + ", " + employee.getAge() + ", " + employee.getSalary() + "\n");
            }
            else{
                Intern intern = Intern.createIntern("Intern"+ i,"Intern"+ i + "@mail.com", random.nextInt(18,65), random.nextDouble(15000,30000));


                if (intern != null) {
                    employees.write(intern.getName() + ", " + intern.getEmail() + ", " + intern.getAge() + ", " + intern.getSalary() + "\n");
                }

            }

        }

        employees.close();
    }
}
