package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class FirstActivity {

    public static void main(String[] args) {
        //TODO 1 Create collection of employee (more than 5) list or map
        Employee employee[] = new Employee[5];

        employee[0] = new Employee();
        employee[0].setAge(40);
        employee[0].setFirstName("Abracadabra");
        employee[0].setSecondName("Mumu");
        employee[0].setEmpId(1234);
        employee[0].setCompanyName("C.t.co");
        employee[0].setJobTitle("Developer");
        employee[0].setSalary(245.6);

        employee[1] = new Employee();
        employee[1].setAge(38);
        employee[1].setFirstName("Filipp");
        employee[1].setSecondName("Ku");
        employee[1].setEmpId(1235);
        employee[1].setCompanyName("Tieto");
        employee[1].setJobTitle("Manager");
        employee[1].setSalary(350.9);

        employee[2] = new Employee();
        employee[2].setAge(28);
        employee[2].setFirstName("Alex");
        employee[2].setSecondName("Tutu");
        employee[2].setEmpId(1236);
        employee[2].setCompanyName("Scala");
        employee[2].setJobTitle("PO");
        employee[2].setSalary(400.9);

        employee[3] = new Employee();
        employee[3].setAge(40);
        employee[3].setFirstName("Will");
        employee[3].setSecondName("Grey");
        employee[3].setEmpId(1237);
        employee[3].setCompanyName("Laplas");
        employee[3].setJobTitle("Cleaner");
        employee[3].setSalary(500.9);

        employee[4] = new Employee();
        employee[4].setAge(25);
        employee[4].setFirstName("Bob");
        employee[4].setSecondName("M");
        employee[4].setEmpId(1238);
        employee[4].setCompanyName("Rose");
        employee[4].setJobTitle("Junior");
        employee[4].setSalary(150.8);

        //		System.out.println() result

        System.out.println("Order of employee is");
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + " name : " + employee[i].getFirstName() + " "
                    + employee[i].getSecondName() + " , Age : " + employee[i].getAge() + " , ID : " + employee[i].getEmpId()
                    + " , Company Name : " + employee[i].getCompanyName() + " , Job Title : " + employee[i].getJobTitle() + " , Salary : "
                    + employee[i].getSalary());
        }
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

    //TODO 4 Create method for full change of employee information
    // for example some employee change his work


}

	
	

