package sef.ATestTask.FirstActivity;

import sef.ATestTask.ThirdActivity.CustomExceptionActivity;

import java.util.Arrays;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        Employee employee[] = new Employee[5];

        //set different attributes of the individual employee.
        employee[0] = new Employee();
        employee[0].setSalary(400);
        try {
            employee[0].setFirstName("Jana");
        } catch (CustomExceptionActivity customExceptionActivity) {
            customExceptionActivity.printStackTrace();
        }
        employee[0].setSecondName("Logunova");

        employee[1] = new Employee();
        employee[1].setSalary(500);
        try {
            employee[1].setFirstName("Anna");
        } catch (CustomExceptionActivity customExceptionActivity) {
            customExceptionActivity.printStackTrace();
        }
        employee[1].setSecondName("Logunova");

        employee[2] = new Employee();
        employee[2].setSalary(20);
        try {
            employee[2].setFirstName("Ksenia");
        } catch (CustomExceptionActivity customExceptionActivity) {
            customExceptionActivity.printStackTrace();
        }
        employee[2].setSecondName("Osadcuka");

        employee[3] = new Employee();
        employee[3].setSalary(10000);
        try {
            employee[3].setFirstName("Mark");
        } catch (CustomExceptionActivity customExceptionActivity) {
            customExceptionActivity.printStackTrace();
        }
        employee[3].setSecondName("Zippen");

        employee[4] = new Employee();
        employee[4].setSalary(350);
        try {
            employee[4].setFirstName("Irina");
        } catch (CustomExceptionActivity customExceptionActivity) {
            customExceptionActivity.printStackTrace();
        }
        employee[4].setSecondName("Bublikovna");


        System.out.println("Order of employee before sorting is");
        //print array as is
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + " name: " + employee[i].getFirstName() + employee[i].getSecondName() + ", Salary : " + employee[i].getSalary());
        }

        //TODO 2 sort and this employees by salary (from min to max)
        Arrays.sort(employee, new SalaryComparator());
        System.out.println("\n\nOrder of employee after sorting by employee salary is");

        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + " name: " + employee[i].getFirstName() + employee[i].getSecondName() + ", Salary : " + employee[i].getSalary());
        }


    }
}






