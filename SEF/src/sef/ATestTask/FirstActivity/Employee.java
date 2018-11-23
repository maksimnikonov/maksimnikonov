package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors

    public Employee(){
        this.empId = 0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0;
    }

    public Employee(int empId, String jobTitle, String companyName, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;

    }

    public Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) {
        super(firstName, secondName, age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee(String firstName, String secondName, int age, String jobTitle, String companyName) {
        super(firstName, secondName, age);
        this.jobTitle = jobTitle;
        this.companyName = companyName;
    }

    //TODO 2 add getters and setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        if (empId > 0) {
            this.empId = empId;
        } else {
            System.out.println("ID is incorrect");
        }
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
        if (salary > 100) {
            this.salary = salary;
        } else {
            System.out.println("Salary is incorrect");
        }
    }


    //TODO 3 override method announce()
        public void announce() {
        System.out.println("My name is " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years old"
                + "\n" + "I am work as " + getJobTitle() + " in " + getCompanyName());
        }


}