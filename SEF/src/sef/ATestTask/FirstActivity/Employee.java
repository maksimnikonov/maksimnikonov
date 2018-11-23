package sef.ATestTask.FirstActivity;

public class Employee extends Person {


    //Attributes
    private int EmpId;
    private double Salary;
    private String Jobtitle;
    private String CompanyName;

    //TODO 1 create different constructors


    ///constructors

    Employee(int empId, String jobtitle, String companyName, int salary) {
        this.EmpId = 10;
        this.Jobtitle = "Engineer";
        this.CompanyName = "KKH";
        this.Salary = 1000.00;

    }

    public Employee() {

    }
    //TODO 2 add getters and setters

    // getter and setter for EmpId
    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }


// getter for double salary

    public double getSalary() {
        return Salary;
    }

    // setter for double salary
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    // getter for String title
    public String getJobtitle() {
        return Jobtitle;
    }

    // setter for String title
    public void setJobtitle(String jobtitle) {
        this.Jobtitle = Jobtitle;
    }

    /// getter for companyName

    public String getCompanyName(String companyName) {
        return companyName;
    }
    ///setter for companyName

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }


    public void announce() {
        super.announce();
        System.out.println("I'm work as" + getJobtitle() + "in" + CompanyName);
    }



}






