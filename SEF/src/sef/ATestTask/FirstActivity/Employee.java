package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private String name;
    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //1 create different constructors
    public Employee(){
        this.name = "Alina";
        this.empId = 10;
        this.jobTitle = "Developer";
        this.companyName = "Accenture";
        this.salary = 7000.00;
    }
    public Employee(String name,int empId, String jobTitle, String companyName, double salary){
        setFirstName(name);
        setEmpId(empId);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);
}

    // 2 add getters and setters
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

    //3 override method announce()
    public String announce(){
       return super.announce();
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        if (name.equals("")) return name = "Unknown";
        else {
            return this.name;
    }
}}