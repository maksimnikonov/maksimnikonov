package sef.ATestTask.FirstActivity;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //    System.out.println() result
        Employee[] employees =
                {
                        new Employee("Accenture","Test engineer",1, 1200),
                        new Employee("Accenture","Automation tester",2, 250),
                        new Employee("Accenture","Developer",3, 864),
                        new Employee("Accenture","Manager",4, 5000),
                        new Employee("Accenture","Intern",5, 2000),
                };

        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //    System.out.println() result

        //TODO 3 create instance of the Person ->
        // use announce()
        // than make them Student
        // use announce()
        // than make them Employee
        // use announce()
        //    System.out.println() result

        Person student = new Student("Aygul","Ismayilova",28,"RIMS school");
        String result = student.announce();
        System.out.println(result);

        Person employee = new Employee("Accenture","Test engineer",1,1500);

        result = employee.announce();
        System.out.println(result);

        //TODO 4 Create method for full change of employee information
        // for example some employee change his work

    }

    public Employee changeEmployee(Employee employee, String companyName, String jobTitle, double salary)
    {
        employee.setCompanyName(companyName);
        employee.setSalary(salary);
        employee.setJobTitle(jobTitle);
        return employee;
    }

}