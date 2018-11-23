package sef.module6.activity;


public class InheritanceActivity {

    public static void main(String[] args) {

        // Create Person object p. Write code to and set name of Person as Sarah Johnson
        // and age as 21
        Person_I p = new Person_I("Sarah", "Johnson", 21);
        p.announce();


        System.out.println("-----------------------------");
        //Create Employee object e and
        // set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
        Employee_I e = new Employee_I();
        e.setFirstName("Shawn");
        e.setSecondName("Cun");
        e.setAge(32);
        e.setTitle("Developer");
        e.setSalary(70000);
        e.announce();


        // Print Info using Employee object
        System.out.println("-----------------------------");
        System.out.println("Employee's First Name is   : " + e.getFirstName());
        System.out.println("Employee's Second Name is   : " + e.getSecondName());
        System.out.println("Employee's Age is    : " + e.getAge());
        System.out.println("Employee's Title is  : " + e.getTitle());
        System.out.println("Employee's Salary is : " + e.getSalary());


        // Print Info using Person object
        System.out.println("-----------------------------");
        System.out.println("Person's First Name is    : " + p.getFirstName());
        System.out.println("Person's Senod Name is    : " + p.getSecondName());
        System.out.println("Person's Age is     : " + p.getAge());
    }
}
