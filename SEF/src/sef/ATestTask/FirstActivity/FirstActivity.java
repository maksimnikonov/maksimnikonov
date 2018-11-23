package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Developer ", " Primer ", 4500));
        employeeList.add(new Employee(2, "Project Manager ", " Primer ", 3500));
        employeeList.add(new Employee(3, "CEO ", " Primer ", 4000));
        employeeList.add(new Employee(4, "HR Manager ", " Primer ", 1200));
        employeeList.add(new Employee(5, "Receptionist ", " Primer ", 1000));
        employeeList.add(new Employee(6, "Security ", " Primer ", 700));
        employeeList.add(new Employee(7, "Cleaner ", " Primer ", 400));
        employeeList.add(new Employee(8, "Cleaner ", " Primer ", 359));


        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("Employee ID: " + employeeList.get(i).getEmpId() + " Job title: " + employeeList.get(i).getJobTitle() + " Salary: " + employeeList.get(i).getSalary());
        }


        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result

        System.out.println();
        int size = employeeList.size();

        do {
            for (int i = 0; i < size-1; i++) {

                if (employeeList.get(i).getSalary() > employeeList.get(i + 1).getSalary()) {

                    Employee temp1 = employeeList.get(i + 1);
                    Employee temp2 = employeeList.get(i);
                    employeeList.set(i, temp1);
                    employeeList.set(i + 1, temp2);
                }
            }  size = size-1;
        } while (size != 1);
           // Displaying the sorted one
           System.out.println();
        System.out.println();

        //employeeList(array);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < employeeList.size(); i++){
            System.out.println( "Employee ID: " + employeeList.get(i).getEmpId() + " Job title: " + employeeList.get(i).getJobTitle() + " Salary: " + employeeList.get(i).getSalary());
        }

    }


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



