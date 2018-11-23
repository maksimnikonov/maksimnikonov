package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Arrays;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		Employee listEmployee[] = new Employee[6];

		listEmployee[0] = new Employee();
		listEmployee[0].setSalary(444);
		listEmployee[0].setFirstName("baobab");

		listEmployee[1] = new Employee();
		listEmployee[1].setSalary(555);
		listEmployee[1].setFirstName("Sam");

		listEmployee[2] = new Employee();
		listEmployee[2].setSalary(765);
		listEmployee[2].setFirstName("Waw");

		listEmployee[3] = new Employee();
		listEmployee[3].setSalary(4880);
		listEmployee[3].setFirstName("Wad");

		listEmployee[4] = new Employee();
		listEmployee[4].setSalary(290);
		listEmployee[4].setFirstName("Sos");

		listEmployee[5] = new Employee();
		listEmployee[5].setSalary(405);
		listEmployee[5].setFirstName("Mark");

		System.out.println("Order of employee before sorting is");
		for(int i=0; i < listEmployee.length; i++){
			System.out.println( "Employee " + (i+1) + " name :: " + listEmployee[i].getFirstName() + ", Salary :: " + listEmployee[i].getSalary());
		}

	/*	//TODO 2 sort and this employees by salary (from min to max)
		Arrays.sort(listEmployee, SalComparator());
			System.out.println("\n\nThis is sorted salary of employees");

			for (int i = 0; i < listEmployee.length; i++) {
				System.out.println("Employee "+ (i+1)+ " name: " + listEmployee[i].getFirstName() + " Salary" + listEmployee[i].getSalary());
			}
*/

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

	
	
}
