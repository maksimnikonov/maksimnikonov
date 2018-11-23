package sef.ATestTask.FirstActivity;

import javax.naming.Name;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
        this.FirstName("John");
        this.SecondName("Maybe");
        this.Age(30);

    }
    //TODO 2 add getters and setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //TODO 3 override method announce()
    public void announce(){
        super.announce();
        System.out.println("My name is" + getFirstName()+ "and i am " + getAge() + " years old" +
                " I am work as " + getJobTitle() +"in "+getCompanyName());
    }


}



