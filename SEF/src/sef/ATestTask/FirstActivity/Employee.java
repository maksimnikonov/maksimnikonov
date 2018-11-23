package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //Constructors
    public Employee() {
        this.empId = 0;
        this.jobTitle = "unknown";
        this.companyName = "unknown";
        this.salary = 0.00;
    }

    public Employee(int empId) {
        this.empId = empId;
    }

    public Employee(int empId, String jobTitle) {
        this.empId = empId;
        this.jobTitle = jobTitle;
    }

    public Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    public Employee(int empId, String jobTitle, String companyName) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
    }

    public Employee(int empId, String jobTitle, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String jobTitle, String companyName) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
    }

    public Employee(String jobTitle, String companyName, double salary) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee(String jobTitle, double salary) {
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String fName, String sName, int age, String jobTitle) {
        super(fName, sName, age);
        this.jobTitle = jobTitle;
    }

    public Employee(String fName, String sName, int age, double salary) {
        super(fName, sName, age);
        this.salary = salary;
    }

    public Employee(int empId, String fName, String sName, int age) {
        super(fName, sName, age);
        this.empId = empId;
    }

    public Employee(int empId, String jobTitle, String companyName, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee(int empId, String fName, String sName, int age, double salary) {
        super(fName, sName, age);
        this.empId = empId;
        this.salary = salary;
    }

    public Employee(int empId, String fName, String sName, int age, String jobTitle) {
        super(fName, sName, age);
        this.empId = empId;
        this.jobTitle = jobTitle;
    }

    public Employee(int empId, String fName, String sName, int age, String jobTitle, String companyName) {
        super(fName, sName, age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
    }

    public Employee(int empId, String fName, String sName, int age, String jobTitle, double salary) {
        super(fName, sName, age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(int empId, String fName, String sName, int age, String jobTitle, String companyName, double salary) {
        super(fName, sName, age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //Getters and Setters
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
        if (!(jobTitle).equals("")) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "unknown";
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (!(companyName).equals("")) {
            this.companyName = companyName;
        } else {
            this.companyName = "unknown";
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

    public void announce() {
        System.out.println("My name is " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old, I work as " + jobTitle + " at " +
                companyName);
    }
}