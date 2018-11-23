package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee( int empId,String jobTitle,String companyName,double salary)
    {this.empId=empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary=salary;

    }
    public Employee(){}

    //TODO 2 add getters and setters
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String jobTitle() {
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
    public double getsalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


    //TODO 3 override method announce()

    public String announce(){
        return "I am"  + getFirstName() +""  + getSecondName() +"and my age is" +getAge() +"my id is" +getEmpId() +"my job title" +jobTitle() +
                "my company is "+getCompanyName() +"salary is "+getsalary();
    }




}