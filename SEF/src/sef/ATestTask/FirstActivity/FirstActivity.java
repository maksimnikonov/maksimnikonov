package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {


		Employee e1 = new Employee(1, "manager", "abc", 3000);
		e1.setFirstName(" anu");
		Employee e2 = new Employee(2, "developer", "abc", 5000);
		e2.setFirstName("anju");
		Employee e3 = new Employee(3, " Developer", "abc", 4000);
		e3.setFirstName("an");
		Employee e4 = new Employee(4, "tester", "abc", 1000);
		e4.setCompanyName("sa");
		Employee e5 = new Employee(5, "support", "abc", 6000);
		e5.setFirstName("a");

		Employee e6 = new Employee(6, "lead", "abc", 10000);
		e6.setFirstName("we");


//TODO 1 Create collection of employee (more than 5) list or map


		//		System.out.println() result
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println("Employee name is" + employeeList.get(i).getFirstName() + "Employee Id : " + employeeList.get(i).getEmpId() + "job title is  :" + employeeList.get(i).jobTitle() +
					"company name is " + employeeList.get(i).getCompanyName() + "salary is " + employeeList.get(i).getsalary());
		}


		//TODO 2 sort and this employees by salary (from min to max)


		// TIP - google bubble sort
		//		System.out.println() result
		int size = employeeList.size();
		double salary = 0.00;
		int counter = size;
		///size = size - 1;
		do {
			for (int i = 0; i < size - 1; i++) {
				if (employeeList.get(i).getsalary() > employeeList.get(i + 1).getsalary()) {
					Employee temp1 = employeeList.get(i + 1);
					Employee temp2 = employeeList.get(i);
					employeeList.set(i, temp1);
					employeeList.set(i + 1, temp2);
				}

			}
			size = size - 1;
		}

			while (size != 1);
			for (int i = 0; i < employeeList.size(); i++) {
				System.out.println("Employee name is" + employeeList.get(i).getFirstName() + "Employee Id : " + employeeList.get(i).getEmpId() + "job title is  :" + employeeList.get(i).jobTitle() +
						"company name is " + employeeList.get(i).getCompanyName() + "salary is " + employeeList.get(i).getsalary());
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


		//e1.changeInfo()
		}


	}

