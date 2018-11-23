package sef.ATestTask.FirstActivity;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class FirstActivity {
    List<Employee> EmployeeList = new ArrayList();

    {
        int EmpId;
        double Salary;
        String Jobtitle;
        String CompanyName;

        {

            Employee emp1 = new Employee();
            Employee emp2 = new Employee();
            Employee emp3 = new Employee();
            Employee emp4 = new Employee();
            Employee emp5 = new Employee();


            emp1.setFirstName("Irina");
            emp1.setSalary(1000);

            emp2.setFirstName("Boris");
            emp2.setSalary(2000);

            emp3.setFirstName("Mark");
            emp3.setSalary(3000);

            emp4.setFirstName("Rita");
            emp4.setSalary(5500);

            emp5.setFirstName("Max");
            emp5.setSalary(8000);

            emp1.setAge(25);
            emp2.setAge(30);
            emp3.setAge(40);
            emp4.setAge(21);
            emp5.setAge(28);

            emp1.setJobtitle("Manager");
            emp2.setJobtitle("Engineer");
            emp3.setJobtitle("HR");
            emp4.setJobtitle("Designer");

            System.out.println("List of employees before sorting");
            emp1.announce();
            emp2.announce();
            emp3.announce();
            emp4.announce();
            emp5.announce();

            List list = new ArrayList();

            list.add(emp1);
            list.add(emp2);
            list.add(emp3);
            list.add(emp4);
            list.add(emp5);


            for (int i <EmployeeList.size();
            i++);
            {
                System.out.println("Employee" + EmployeeList.get(5).getEmpId() + "JobTitle" + EmployeeList.get(5).getJobtitle() + "CompanyName" + EmployeeList.get(5).getCompanyName() + "Salary" + EmployeeList.get(5).getSalary());
            }
///Bubble sort

            for (int i = 0, i <EmployeeList.size();
            i++);
            System.out.println(EmployeeList.size() + "Employee" + EmployeeList.get(5).getJobtitle() + EmployeeList.get(5).getCompanyName() + EmployeeList.get(5).getSalary());
        }
    }
}

