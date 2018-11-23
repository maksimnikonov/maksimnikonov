package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FirstActivity {

	private CopyOnWriteArrayList employeeList;

	public static void main(String[] args) {

		Employee a = new Employee(1, "Mark", "Deen", "Accenture", 1250.00);

		Employee b = new Employee(2, "John", "Doe", "Sun Microsystems", 100.000);

		Employee c = new Employee(3, "Derek", "Berek", "IBM", 1000);

		Employee d = new Employee(4, "Janis", "Krumins", "Lattelecom", 1100);

		Employee e = new Employee(5, "Ivans", "Ivanovs", "LMT", 1200);

		Employee f = new Employee(6, "Karlis", "Liepins", "Tele 2", 1300);

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(a);
		employeeList.add(b);
		employeeList.add(c);
		employeeList.add(d);
		employeeList.add(e);
		employeeList.add(f);

		for (int i = 0; i < employeeList.size(); i++) {

			System.out.println("Employee ID: " + employeeList.get(i).getEmpId() + ", name: " + employeeList.get(i).getFirstName()
					+ ", surname: " + employeeList.get(i).getSecondName() + " company name: " + employeeList.get(i).getCompanyName() + " salary: " + employeeList.get(i).getSalary());
		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		int size = employeeList.size();
		double salary = 0.00;
		int counter = size;
		do {
			for (int i = 0; i < size - 1; i++) {
				if (employeeList.get(i).getSalary() > employeeList.get(i + 1).getSalary()) {

					Employee temp1 = employeeList.get(i + 1);
					Employee temp2 = employeeList.get(i);

					employeeList.set(i, temp1);
					employeeList.set(i + 1, temp2);
				}
			}
			size = size - 1;
		} while (size != 1);

		for (
				int i = 0; i < employeeList.size(); i++) {

			System.out.println("Employee ID: " + employeeList.get(i).getEmpId() + ", name: " + employeeList.get(i).getFirstName()
					+ ", surname: " + employeeList.get(i).getSecondName() + " company name: " + employeeList.get(i).getCompanyName() + " salary: " + employeeList.get(i).getSalary());
		}
	}
}
		//TODO 4 Create method for full change of employee information
		// for example some employee change his work



