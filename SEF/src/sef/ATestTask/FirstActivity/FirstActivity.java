package sef.ATestTask.FirstActivity;

import java.util.*;

public class FirstActivity {

	public static void main(String[] args) {

		Employee e1 = new Employee( 1 ,"Mahdi" ,"Informaticien" , 3000 );
		Employee e2 = new Employee( 2 ,"Faycel " ,"Mathematicien" , 3500);
		Employee e3 = new Employee( 3 ,"Bentahar " ,"Singer" , 6000);
		Employee e4 = new Employee( 4 ," zebi" ,"Professional pr " , 2000);
		Employee e5 = new Employee( 5 ,"Alex ", "Teacher" , 1000);

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result


		List <Employee>employeeList = new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		// just for printing
		for(int i = 0; i < employeeList.size(); i++) {
			System.out.println(" Employee Id : " + employeeList.get(i).getEmpId()+ "Emp Name  " + employeeList.get(i).getFirstName() + " Employee Job : "
					+ employeeList.get(i).getJobTitle() + " Employee Salary : " + employeeList.get(i).getSalary()  );
		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		System.out.println() ;
					int size = employeeList.size();
					do {

						for (int i = 0; i < size-1; i++) {

							if (employeeList.get(i).getSalary() > employeeList.get(i + 1).getSalary()) {


								Employee temp1= employeeList.get(i + 1);
					Employee temp2= employeeList.get(i);
					employeeList.set(i,temp1);
					employeeList.set(i+1,temp2);

				}
			}
			size = size-1;
		} while (size != 1);
		// Displaying the sorted one
		System.out.println();

		// just for printing
		for(int i = 0; i < employeeList.size(); i++) {
			System.out.println(" Employee Id : " + employeeList.get(i).getEmpId()+ "Emp Name  " +
					employeeList.get(i).getFirstName() + " Employee Job : " + employeeList.get(i).getJobTitle()
					+ " Employee Salary : " + employeeList.get(i).getSalary()  );
		}

		//TODO 3 create instance of the Person ->
		Person p1 = new Person(); // You said we dont have to do it
		System.out.println( p1.announce());
		// use announce()


		//TODO 4 Create method for full change of employee information
		// for example some employee change his work
		System.out.println(" \n");


		// Put the new job name
		updateEmp(e2 ," Developer  "  );
	}


public static void updateEmp (Employee employeeList , String name  ){

    employeeList.setJobTitle(name);
			System.out.println("ID  " + employeeList.getEmpId() +" Name " +employeeList.getFirstName()
			+ "New Job Name  "+ employeeList.getJobTitle() + "Salary "+ employeeList.getSalary() );




}





}
