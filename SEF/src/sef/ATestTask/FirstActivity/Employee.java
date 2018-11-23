package sef.ATestTask.FirstActivity;

import java.util.List;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors

    //constructors

    public Employee(){
        this.empId = 15;
        this.jobTitle = "CEO";
        this.companyName = "MMM";
        this.salary = 750;
    }

    Employee(int empId, String jobTitle, String companyName, int salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //getter for int empID
    public int getEmpId() {
        return empId;
    }

    //getter for String getJobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    //getter String getCompanyName
    public String getCompanyName() {
        return companyName;
    }

    //getter for int getSalary
    public double getSalary() {
        return salary;
    }

    //setter for String setJobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    //setter for String setCompanyName
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    //setter for int setEmpID
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    //setter for double setSalary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //TODO 3 override method announce()

    public void announce() {
        super.anounce();
        System.out.println("I work as " + jobTitle + " in " + companyName);
    }

    public String getProductInrofmation() {
        return "Employee with id: " + empId + " and job title: " + jobTitle + " Company name: " + companyName + "and salary is : " + salary;
    }

    public void print(List list) {
    }
}