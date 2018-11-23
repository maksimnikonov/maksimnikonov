package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empID;
    private String jobTitle;
    private String companyName;
    private double salary;

                                        //TODO 1 create different constructors

    //  Behavior - default constructor
    public Employee(){

    }

    //  Behavior - parameterized constructor
    public Employee(int empID, String jobTitle, String companyName, double salary) {
        this.empID = empID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    // Getter & Setter for int empID

    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    // Getter & Setter for String jobTitle

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Getter & Setter for String companyName

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Getter & Setter for double Salary

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //TODO 3 override method announce()

    public String announce() {
        return "My employeeID is " + getEmpID() + ". I work as a" + getJobTitle() + " in " + getCompanyName() + " company. I wish my salary was about" + getSalary() + "euros per day :)";
    }


}