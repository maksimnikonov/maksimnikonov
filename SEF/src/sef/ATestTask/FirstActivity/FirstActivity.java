package sef.ATestTask.FirstActivity;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result

        Map map = new HashMap();
        map.put(0, new Employee("John", "Jhonson", 35, 91, "Developer", "Accenture", 1200));
        map.put(1, new Employee("Sarah", "Parker", 28, 92, "Tester", "IT company", 1000));
        map.put(2, new Employee("David", "Smith", 55, 93, "Doctor", "Slimnica", 1250));
        map.put(3, new Employee("Tina", "Turner", 19, 94, "Teacher", "School", 900));
        map.put(4, new Employee("Poul", "Sharks", 45, 95, "Policeman", "Police", 955));
        map.put(5, new Employee("Cris", "Tomson", 30, 96, "Manager", "Shop", 800));


        for (int i = 0; i < map.size(); i++) {
            System.out.println(((Employee) map.get(i)).getFirstName() + " " + ((Employee) map.get(i)).getSecondName() + " " +
                    ((Employee) map.get(i)).getAge() + " " + ((Employee) map.get(i)).getEmpId() + " " + ((Employee) map.get(i)).getJobTitle() + " " +
                    ((Employee) map.get(i)).getCompanyName() + " " + ((Employee) map.get(i)).getSalary());


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

        Employee E = new Employee();
        E.setFirstName("Ilze");
        E.setSecondName("Ozola");
        E.setAge(20);
        E.setEmpId(99);
        E.setJobTitle("Nurse");
        E.setCompanyName("Hospital");
        E.setSalary(500);
        E.announce();

        Person P = E;
        P.announce();

        Student S = new Student();
        S.setFirstName("Dainis");
        S.setSecondName("Kalninsh");
        S.setAge(25);
        S.setSchoolName("LU");
        S.announce();

        Person PS = S;
        PS.announce();


        //TODO 4 Create method for full change of employee information
        // for example some employee change his work

    }
}