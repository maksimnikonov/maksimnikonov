package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

	// 1 Create collection of employee (more than 5) list or map

	public static void main(String[] args) {
		List<Employee> myList = new ArrayList<>();
		myList.add(new Employee("Alina",10, "Developer", "Accenture", 7000.00));
		myList.add(new Employee("Igors",12, "Developer", "LMT", 27389.00));
		myList.add(new Employee("Antons",22, "Without job", "Nothing", 02.00));
		myList.add(new Employee("Anna",111, "Shoper", "sss", 028.00));
		myList.add(new Employee("Kirils",1321, "Student", "school", 37.00));
		for (Employee employee : myList) {
			System.out.println("My id is " + employee.getEmpId() + " and job is " + employee.getJobTitle() + " and company " +
					employee.getCompanyName() + " with the salary " + employee.getSalary());
		}

		// 2 sort and this employees by salary (from min to max)void

		int size = myList.size();
		do {

			for (int i = 0; i < size-1; i++) {

				if (myList.get(i).getSalary() > myList.get(i + 1).getSalary()) {


					Employee temp1= myList.get(i + 1);
					Employee temp2= myList.get(i);
					myList.set(i,temp1);
					myList.set(i+1,temp2);

				}
			}
			size = size-1;
		} while (size != 1);
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(" Employee Id : " + myList.get(i).getEmpId() + " Employee Job : "
					+ myList.get(i).getJobTitle() + " Employee Salary : " + myList.get(i).getSalary()  );
		}


		//TODO 3 create instance of the Person ->

		// than make them Student
		// use announce()
		// than make them Employee
		// use announce()
		//		System.out.println() result

		//TODO 4 Create method for full change of employee information
		// Put the new job name
		updateEmp( new Employee("Igors",12, "Developer", "LMT", 27389.00)," Developer  ");
	}

	public static void updateEmp (Employee employeeList , String name  ){

		employeeList.setJobTitle(name);
		System.out.println("ID  " + employeeList.getEmpId() +" Name " +employeeList.getFirstName()
				+ "New Job Name  "+ employeeList.getJobTitle() + "Salary "+ employeeList.getSalary() );


	}
}
