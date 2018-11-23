package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) {
        super(firstName, secondName, age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee() {
    }

    //TODO 2 add getters and setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        if (empId > 0) {
            this.empId = empId;
        } else {
            this.empId = 0;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (!jobTitle.equals(" ")) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Unknown Job Tittle";
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (!companyName.equals(" ")) {
            this.companyName = companyName;
        } else {
            this.companyName = "Unknown Company Name";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    //TODO 3 override method announce()

    @Override
    public String announce() {
        return "My name is " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old."
                + " I am work as " + getJobTitle() + " in company " + getCompanyName() + ".";
    }
}