package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle; //actually not used in firstActivity, in testing it is
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    Employee(int empId, String firstName, String secondName, String companyName, double salary) {

        setEmpId(empId);
        setCompanyName(companyName);
        setSalary(salary);
        setFirstName(firstName);
        setSecondName(secondName);
    }

    Employee() { }

    //TODO 2 add getters and setters
    public int getEmpId() {return empId;}

    public void setEmpId(int empId) {this.empId = empId;}

    public String getJobTitle() {return jobTitle;}

    public void setJobTitle(String jobTitle) {this.jobTitle = jobTitle;}

    public String getCompanyName() {return companyName;}

    public void setCompanyName(String companyName) {
        if (!(companyName.equals(""))) this.companyName = companyName;
        else this.companyName = "Unknown";
    }

    public double getSalary() {return salary;}

    public void setSalary(double salary) {this.salary = salary;}

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Employee ID:" + empId);
        buffer.append(" name: " + getFirstName());
        buffer.append(" surname: " + getSecondName());
        buffer.append(" company name: " + companyName);
        buffer.append(" salary: " + salary);
        return buffer.toString();
    }

    //TODO 3 override method announce()
    public String announce() {
        return "Employee ID: " + empId + ", job title: " + getJobTitle() + ", company name:  " + getCompanyName()
                + ", salary: " + salary;
    }

    public String toString1() {
        StringBuffer buffer1 = new StringBuffer();
        buffer1.append("Employee ID:" + empId);
        buffer1.append(" name: " + getFirstName());
        buffer1.append(" surname: " + getSecondName());
        buffer1.append(" company name: " + companyName);
        buffer1.append(" salary: " + salary);
        return buffer1.toString();
    }
}