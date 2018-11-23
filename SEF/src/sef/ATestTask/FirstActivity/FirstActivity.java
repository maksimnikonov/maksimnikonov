package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result
        Employee eOne = new Employee();
        eOne.setFirstName("Andrej");
        eOne.setSecondName("Qwerty");
        eOne.setAge(25);
        eOne.setEmpId(14);
        eOne.setJobTitle("manager2");
        eOne.setCompanyName("Accenture");
        eOne.setSalary(910.00);
        eOne.announce();

        System.out.println("--------------------------------------");
        System.out.println("Employee's First Name is: " + eOne.getFirstName());
        System.out.println("Employee's Second Name is: " + eOne.getSecondName());
        System.out.println("Employee's Age is: " + eOne.getAge());
        System.out.println("Employee's employee ID is: " + eOne.getEmpId());
        System.out.println("Employee's job Tittle is: " + eOne.getJobTitle());
        System.out.println("Employee's company name is: " + eOne.getCompanyName());
        System.out.println("Employee's salary is: " + eOne.getSalary());

        ArrayList<Employee> allEmployees = new ArrayList<Employee>();
        allEmployees.add(new Employee("Igorj", "Asdf", 26, 15, "manager3", "Accenture", 915.00));
        allEmployees.add(new Employee("Artjom", "Zxcv", 28, 16, "manager4", "Accenture", 933.00));
        allEmployees.add(new Employee("Fedja", "Fjllhnbb", 30, 17, "manager5", "Accenture", 930.00));
        allEmployees.add(new Employee("Vasja", "Ycndkc", 31, 18, "manager6", "Accenture", 947.00));
        allEmployees.add(new Employee("Vanja", "Pvndkvb", 45, 19, "manager7", "Accenture", 936.00));


        for (Employee employee : allEmployees) {
            System.out.println("--------------------------------------");
            System.out.println("Employee's First Name is: " + employee.getFirstName());
            System.out.println("Employee's Second Name is: " + employee.getSecondName());
            System.out.println("Employee's Age is: " + employee.getAge());
            System.out.println("Employee's employee ID is: " + employee.getEmpId());
            System.out.println("Employee's job Tittle is: " + employee.getJobTitle());
            System.out.println("Employee's company name is: " + employee.getCompanyName());
            System.out.println("Employee's salary is: " + employee.getSalary());

        }


        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result


        //TODO 3 create instance of the Person ->
        // use announce()
        // than make them Student
        // use announce()
        // than make them Employee
        // use announce()
        //		System.out.println() result

        Person ps = new Student("Gena", "Ghjbfjeh", 18, "RTU");
        Student tempStudent = (Student)ps;
        tempStudent.announce();

        Person pe = new Employee("Bob", "Hjkjkdfj", 23, 200, "manager200", "Accenture", 1234.00);
        Employee tempEmployee = (Employee)pe;
        tempEmployee.announce();

        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Person to Student: " + ps.announce());
        System.out.println("Person to Employee: " + pe.announce());


        //TODO 4 Create method for full change of employee information
        // for example some employee change his work
        // Andrej Qwerty 25, 14, manager2, Accenture, 910.00 to --->> Andrej Qwerty 25, 14, manager2 finished his job in Accenture
        String changeEmployeeStatus = "Andrej Qwerty - works in Accenture";
        changeEmployeeStatus = changeEmployeeStatus.replaceAll("works in Accenture", "left Accenture!");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println(changeEmployeeStatus);
    }
}
