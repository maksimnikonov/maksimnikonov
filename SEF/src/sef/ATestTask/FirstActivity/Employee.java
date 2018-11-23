package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
        this.companyName = "Accenture";
        this.empId = 234;
        this.jobTitle = "Tester";
        this.salary = 200.00;
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
        if
        (!(jobTitle.equals(""))) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "unknown";
        }
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

    @Override
    public String announce() {
        return "My name is " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old. I am working as " + getJobTitle()+ " in " + getCompanyName() +  " .";
      }


}
