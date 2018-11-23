package sef.ATestTask.FirstActivity;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class FirstActivity extends Person{

	public static void main(String[] args) throws IOException {

		//TODO 1 Create collection of employee (more than 5) list or map
	List<Employee> employees = new ArrayList<Employee>();
			employees.add(new Employee("Ivan","Drago",101,"Worker","Accenture", 350.6, 33));
			employees.add(new Employee("Rocky","Balboa",102,"Programmer","Accenture", 760.9, 55));
			employees.add( new Employee("Adonnis","Creed", 103,"Tester","Accenture", 570.2,34));
			employees.add(new Employee("Tony","Stark",104,"Analyst","Accenture", 660.5,65));
			employees.add(new Employee("Bruce","Wayne",105,"Intern","Accenture", 200.8,32));
			employees.add(new Employee("Bucky","Barnes",106,"Worker","Accenture", 350.6,34));
			for(Employee employee : employees){
				System.out.println("Employee id : "+ employee.getEmpId() + "; First name: " + employee.getFirstName() + "; Second name: " + employee.getSecondName() + "; Employee title: "
						+ employee.getJobTitle() + "; Company name: "
						+ employee.getCompanyName() + "; Salary " + employee.getSalary() + "; age: " + employee.getAge());
			}

        FileWriter writer = new FileWriter("output.txt");
        for(Employee employee: employees) {
            writer.write(String.valueOf(employee));
        }
        writer.close();
		//TODO 2 sort and this employees by salary (from min to max)
/*
		//TODO 3 create instance of the Person ->
		Person person1 = new Person("Kurt", "Cobain", 33);
			person1.announce();

        // use announce()
		// than make them Student
        Student person2 =  (Student) person1;
		person2.setSchoolName("VeA");

        person2.announce();
		// than make them Employee
        Employee person3 = (Employee) person1;
		// use announce()
        person3.setSalary(307.7);
        person3.setCompanyName("Accenture");
        person3.setEmpId(201);
        person3.setJobTitle("Intern");
        person3.announce();

        System.out.println(person1.announce());
        System.out.println(person2.announce());
        System.out.println(person3.announce());
*/
		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}



}
