package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors

    public Employee() {
    }

    public Employee(String jobTitle, String companyName){
        this.jobTitle = jobTitle;
        this.companyName = companyName;
    }

    public Employee (String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }
    public Employee(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
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

    public String announce() {
        return "My name is " + getFirstName() + " " + getSecondName() +"and i am " + getAge() + " years old" + " I am work as " + getJobTitle() + " in " +getCompanyName();
    }




}